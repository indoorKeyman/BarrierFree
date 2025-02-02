package com.example.back_end_bf.repository;

import com.example.back_end_bf.dto.BarrierFreeDTO;
import com.example.back_end_bf.dto.RecoBarrierFreeDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class BarrierFreeRepository {

    private final SqlSessionTemplate sql;

    public List<RecoBarrierFreeDTO> getBarrierFreeByUser(Map<String, Object> params){
        return sql.selectList("BarrierFree.getBarrierFreeByUser", params);
    }

    public List<RecoBarrierFreeDTO> getLikeBarrierFree(Map<String, Object> params){
        return sql.selectList("BarrierFree.getLikeBarrierFree", params);
    }

    public Integer updateBarrierFree(Map<String, Object> params) {
        return sql.update("BarrierFree.updateBarrierFree", params);
    }

    public BarrierFreeDTO countBarrierFreeLike(Map<String, Object> params){
        return sql.selectOne("BarrierFree.countBarrierFreeLike", params);
    }


}