package com.example.back_end_bf.repository;

import com.example.back_end_bf.dto.JoinClubDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@RequiredArgsConstructor
public class JoinClubRepository {

    private final SqlSessionTemplate sql;

    public Integer joinClub(Map<String, Object> params) {
        return sql.insert("JoinClub.joinClub", params);
    }

    public Integer joinDuplicationCheck(Map<String, Object> params) {
        return sql.selectOne("JoinClub.joinDuplicationCheck", params);
    }

    public List<JoinClubDTO> appliedList(Map<String, Object> params){
        return sql.selectList("JoinClub.appliedList", params);
    }

    public Integer removeClub(Map<String, Object> params) {
        return sql.delete("JoinClub.removeClub", params);
    }

}