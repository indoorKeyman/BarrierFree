package com.example.back_end_bf.service;

import com.example.back_end_bf.dto.BarrierFreeDTO;
import com.example.back_end_bf.dto.RecoBarrierFreeDTO;
import com.example.back_end_bf.repository.BarrierFreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BarrierFreeService {
    private final BarrierFreeRepository barrierFreeRepository;

    public List<RecoBarrierFreeDTO> getBarrierFreeByUser(
            String user_index,
            String user_id
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);

        return barrierFreeRepository.getBarrierFreeByUser(params);
    }

    public List<RecoBarrierFreeDTO> getLikeBarrierFree(
            String user_index,
            String user_id
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);

        return barrierFreeRepository.getLikeBarrierFree(params);
    }

    public Integer updateBarrierFree(
            int reco_barrier_free_spot_index,
            String reason,
            int like_yn
    ){

        Map<String, Object> params = new HashMap<>();
        params.put("reco_barrier_free_spot_index", reco_barrier_free_spot_index);
        params.put("reason", reason);
        params.put("like_yn", like_yn);

        return barrierFreeRepository.updateBarrierFree(params);
    }

    public BarrierFreeDTO countBarrierFreeLike(
            String facility_name,
            String branch_name,
            double latitude,
            double longitude
    ){

        Map<String, Object> params = new HashMap<>();
        params.put("facility_name", facility_name);
        params.put("branch_name", branch_name);
        params.put("latitude", latitude);
        params.put("longitude", longitude);


        return barrierFreeRepository.countBarrierFreeLike(params);
    }



}