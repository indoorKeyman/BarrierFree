package com.example.back_end_bf.dto;

import lombok.*;
import java.sql.Timestamp;

@Setter
@Getter
public class UserDTO {

    private int user_index;

    private String id;

    private String password;

    private String email;

    private Timestamp birthday;

    private String name;

    private int age;

    private String age_floor;

    private String gender;

    private String disability;

    private String disability_detail;

    private String disability_rank;

    private String exercise_experience;

    private String exercise_purpose;

    private Timestamp create_date ;

    private String role;

}
