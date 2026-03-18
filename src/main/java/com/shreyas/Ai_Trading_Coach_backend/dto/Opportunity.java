package com.shreyas.Ai_Trading_Coach_backend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Opportunity {

    private String symbol;
    private String sector;
    private double score;
    private double momentum;
    private String summary;

}