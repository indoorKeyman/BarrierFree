package com.example.back_end_bf.controller;

import com.example.back_end_bf.dto.JoinClubDTO;
import com.example.back_end_bf.service.JoinClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/join_club")
public class JoinClubController {

    private final JoinClubService joinClubService;

    public JoinClubController(JoinClubService joinClubService) {
        this.joinClubService = joinClubService;
    }

    @PostMapping("/join")
    public ResponseEntity<String> join (
            @RequestParam Integer user_index,
            @RequestParam String user_id,
            @RequestParam String club_nm,
            @RequestParam String club_time
    ) {
        System.out.println("join Operating...");

        if (
                joinClubService.joinDuplicationCheck(
                        user_index,
                        user_id,
                        club_nm,
                        club_time
                ) > 0
        ) return ResponseEntity.ok("Already Exist");
        else{
            Integer result = joinClubService.joinClub(
                    user_index,
                    user_id,
                    club_nm,
                    club_time
            );

            return ResponseEntity.ok(result > 0 ? "Successful Join" : "Join Failure" );
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<JoinClubDTO>> appliedList(
            @RequestParam Integer user_index,
            @RequestParam String user_id
    ){
        System.out.println("appliedList Operating...");

        return ResponseEntity.ok(joinClubService.appliedList(user_index, user_id));

    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> removeClub(
            @RequestParam Integer user_index,
            @RequestParam String user_id,
            @RequestParam String club_nm,
            @RequestParam String club_time
    ){
        System.out.println(club_nm + " removeClub Operating...");

        Integer result = joinClubService.removeClub(
                user_index,
                user_id,
                club_nm,
                club_time
        );

        return ResponseEntity.ok(result > 0 ?  "Successful Remove" : "Remove Failure");

    }

}
