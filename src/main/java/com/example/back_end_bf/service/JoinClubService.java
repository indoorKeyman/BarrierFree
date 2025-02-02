package com.example.back_end_bf.service;

import com.example.back_end_bf.dto.JoinClubDTO;
import com.example.back_end_bf.repository.JoinClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class JoinClubService {
    private final JoinClubRepository joinClubRepository;

    public Integer joinClub(
            Integer user_index,
            String user_id,
            String club_nm,
            String club_time
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);
        params.put("club_nm", club_nm);
        params.put("club_time", club_time);

        return joinClubRepository.joinClub(params);
    }

    public Integer joinDuplicationCheck(
            Integer user_index,
            String user_id,
            String club_nm,
            String club_time
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);
        params.put("club_nm", club_nm);
        params.put("club_time", club_time);

        Integer result = joinClubRepository.joinDuplicationCheck(params);

        return result;
    }


    public List<JoinClubDTO> appliedList(
            Integer user_index,
            String user_id
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);

        return joinClubRepository.appliedList(params);
    }

    public Integer removeClub(
            Integer user_index,
            String user_id,
            String club_nm,
            String club_time
    ){

        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);
        params.put("club_nm", club_nm);
        params.put("club_time", club_time);

        return joinClubRepository.removeClub(params);
    }

}