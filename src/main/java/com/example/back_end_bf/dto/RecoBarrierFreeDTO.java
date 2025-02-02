package com.example.back_end_bf.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
public class RecoBarrierFreeDTO {

    private int reco_barrier_free_spot_index;

    private int user_index;

    private String user_id;

    private String facility_name;

    private String branch_name;

    private double latitude;

    private double longitude;

    private String reason;

    private int like_yn;

    private Timestamp update_date;


}
