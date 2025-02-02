package com.example.back_end_bf.controller;

import com.example.back_end_bf.dto.ClubDTO;
import com.example.back_end_bf.dto.LikeClubDTO;
import com.example.back_end_bf.service.LikeClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/like_club")
public class LikeClubController {

    private final LikeClubService likeClubService;

    public LikeClubController(LikeClubService likeClubService) {
        this.likeClubService = likeClubService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<LikeClubDTO>> appliedList(
            @RequestParam Integer user_index,
            @RequestParam String user_id
    ){
        System.out.println("likedList Operating...");

        return ResponseEntity.ok(likeClubService.likedListClub(user_index, user_id));
    }

    @PostMapping("/update")
    public ResponseEntity<String> removeClub(
            @RequestParam Integer user_index,
            @RequestParam String user_id,
            @RequestParam String club_nm,
            @RequestParam String club_time
    ){
        System.out.println(club_nm + " removeClub Operating...");

        Integer result = likeClubService.updateLikeClub(
                user_index,
                user_id,
                club_nm,
                club_time
        );

        return ResponseEntity.ok(result > 0 ?  "Successful Update" : "Update Failure");

    }

    @GetMapping("/like_counter")
    public ResponseEntity<ClubDTO> countClubLike(
            @RequestParam String club_nm,
            @RequestParam String club_time
    ){
        System.out.println(club_nm + " countClubLike Operating...");

        ClubDTO result = likeClubService.countClubLike(
                club_nm,
                club_time
        );

        return ResponseEntity.ok(result);

    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertLikeClub(
            @RequestParam Integer user_index,
            @RequestParam String user_id,
            @RequestParam String club_nm,
            @RequestParam String club_time
    ){
        System.out.println(club_nm + " duplicateCheckBeforeInsert Operating...");

        if(likeClubService.duplicateCheckBeforeInsert(
                user_index,
                user_id,
                club_nm,
                club_time
        )>0){
            return ResponseEntity.ok( club_nm + " Already exist");
        }


        System.out.println(club_nm + " insertLikeClub Operating...");

        Integer result = likeClubService.insertLikeClub(
                user_index,
                user_id,
                club_nm,
                club_time
        );

        return ResponseEntity.ok(result > 0 ?  "Successful insertLikeClub" : "insertLikeClub Failure");

    }

}
