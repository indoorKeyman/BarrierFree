package com.example.back_end_bf.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
public class BarrierFreeDTO {

    private String facility_name;

    private String branch_name;

    private String category1;

    private String category2;

    private String province;

    private String city_district;

    private String township;

    private String ji_name;

    private String building_number;

    private String street_name;

    private String building_code;

    private double latitude;

    private double longitude;

    private String postal_code;

    private String road_address;

    private String land_lot_address;

    private String phone_number;

    private String homepage;

    private String blog_address;

    private String facebook_address;

    private String instagram_address;

    private String holiday;

    private String operating_hours;

    private String free_parking;

    private String paid_parking;

    private String admission_fee;

    private String disabled_access_door;

    private String wheelchair_rental;

    private String disabled_toilet;

    private String disabled_parking;

    private String large_parking_allowed;

    private String guide_dog_allowed;

    private String braille_guide;

    private String audio_guide_korean;

    private String last_update;

    private int total_prefer;

}
