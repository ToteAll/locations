package com.toteall.locations.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {
    private String postcode;
    private int quality;
    private int eastings;
    private int northings;
    private String country;
    private String nhsHa;
    private double longitude;
    private double latitude;
    private String europeanElectoralRegion;
    private String primaryCareTrust;
    private String region;
    private String lsoa;
    private String msoa;
    private String incode;
    private String outcode;
    private String parliamentaryConstituency;
    private String parliamentaryConstituency2024;
    private String adminDistrict;
    private String parish;
    private String adminCounty;
    private String dateOfIntroduction;
    private String adminWard;
    private String ced;
    private String ccg;
    private String nuts;
    private String pfa;
    private Codes codes;
}
