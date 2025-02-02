package com.example.back_end_bf.dto;

import lombok.*;

import java.sql.Timestamp;


@Getter
@Setter
public class JoinClubDTO {

    private int join_club_index;

    private int user_index;

    private String user_id;

    private String club_nm;

    private String club_time;

    private Timestamp create_date;

}
