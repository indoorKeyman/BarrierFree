package com.example.back_end_bf.repository;

import com.example.back_end_bf.dto.ClubDTO;
import com.example.back_end_bf.dto.LikeClubDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class LikeClubRepository {

    private final SqlSessionTemplate sql;

    public List<LikeClubDTO> likedClubList(Map<String, Object> params){
        return sql.selectList("LikeClub.likeClubList", params);
    }

    public Integer updateLikeClub(Map<String, Object> params){
        return sql.update("LikeClub.updateLikeClub", params);
    }

    public ClubDTO countClubLike(Map<String, Object> params){
        return sql.selectOne("LikeClub.countClubLike", params);
    }

    public Integer insertLikeClub(Map<String, Object> params){
        return sql.insert("LikeClub.insertLikeClub", params);
    }

    public Integer duplicateCheckBeforeInsert(Map<String, Object> params){
        return sql.selectOne("LikeClub.duplicateCheckBeforeInsert", params);
    }

}