package com.toteall.locations.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Codes {
    private String adminDistrict;
    private String adminCounty;
    private String adminWard;
    private String parish;
    private String parliamentaryConstituency;
    private String parliamentaryConstituency2024;
    private String ccg;
    private String ccgId;
    private String ced;
    private String nuts;
    private String lsoa;
    private String msoa;
    private String lau2;
    private String pfa;
}
