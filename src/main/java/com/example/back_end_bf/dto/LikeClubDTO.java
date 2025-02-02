package com.example.back_end_bf.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
public class LikeClubDTO {

    private int like_club_index;

    private int  user_index;

    private String  user_id;

    private String club_nm;

    private String club_time;

    private Boolean like_yn;

    private Timestamp update_date;

}
