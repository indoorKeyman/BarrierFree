package com.example.back_end_bf.service;

import com.example.back_end_bf.dto.ClubDTO;
import com.example.back_end_bf.dto.LikeClubDTO;
import com.example.back_end_bf.repository.JoinClubRepository;
import com.example.back_end_bf.repository.LikeClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class LikeClubService {
    private final LikeClubRepository likeClubRepository;

    public List<LikeClubDTO> likedListClub(
            Integer user_index,
            String user_id
    ){
        Map<String, Object> params = new HashMap<>();
        params.put("user_index", user_index);
        params.put("user_id", user_id);

        return likeClubRepository.likedClubList(params);
    }

    public Integer updateLikeClub(
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

        return likeClubRepository.updateLikeClub(params);
    }

    public ClubDTO countClubLike(
            String club_nm,
            String club_time
    ){

        Map<String, Object> params = new HashMap<>();
        params.put("club_nm", club_nm);
        params.put("club_time", club_time);

        return likeClubRepository.countClubLike(params);
    }

    public Integer insertLikeClub(
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

        return likeClubRepository.insertLikeClub(params);
    }

    public Integer duplicateCheckBeforeInsert(
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

        return likeClubRepository.duplicateCheckBeforeInsert(params);
    }

}