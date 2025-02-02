package com.example.back_end_bf.controller;

import com.example.back_end_bf.dto.BarrierFreeDTO;
import com.example.back_end_bf.dto.RecoBarrierFreeDTO;
import com.example.back_end_bf.service.BarrierFreeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/barrier_free")
public class BarrierFreeController {

    private final BarrierFreeService barrierFreeService;

    public BarrierFreeController(BarrierFreeService barrierFreeService) {
        this.barrierFreeService = barrierFreeService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<RecoBarrierFreeDTO>>  getBarrierFreeByUser (
            @RequestParam String user_index,
            @RequestParam String user_id
    ) {
        System.out.println("getBarrierFreeByUser Operating...");

        return ResponseEntity.ok(barrierFreeService.getBarrierFreeByUser(user_index, user_id));
    }

    @GetMapping("/like")
    public ResponseEntity<List<RecoBarrierFreeDTO>>  getLikeBarrierFree (
            @RequestParam String user_index,
            @RequestParam String user_id
    ) {
        System.out.println("getLikeBarrierFree Operating...");

        return ResponseEntity.ok(barrierFreeService.getLikeBarrierFree(user_index, user_id));
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateBarrierFree (
            @RequestParam int reco_barrier_free_spot_index,
            @RequestParam String reason,
            @RequestParam int like_yn
    ) {
        System.out.println("updateBarrierFree Operating...");

        Integer result = barrierFreeService.updateBarrierFree(
                reco_barrier_free_spot_index,
                reason,
                like_yn
        );

        return ResponseEntity.ok(result > 0 ?  "Successful updateBarrierFree" : "updateBarrierFree Failure");
    }

    @GetMapping("/like_counter")
    public ResponseEntity<BarrierFreeDTO> countBarrierFreeLike(
            @RequestParam String facility_name,
            @RequestParam String branch_name,
            @RequestParam double latitude,
            @RequestParam double longitude
    ){
        System.out.println(facility_name + " countBarrierFreeLike Operating...");

        BarrierFreeDTO result = barrierFreeService.countBarrierFreeLike(
                facility_name,
                branch_name,
                latitude,
                longitude
        );

        return ResponseEntity.ok(result);

    }




}
