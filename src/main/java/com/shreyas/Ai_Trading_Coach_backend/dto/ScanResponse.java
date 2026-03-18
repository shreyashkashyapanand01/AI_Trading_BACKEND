package com.shreyas.Ai_Trading_Coach_backend.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ScanResponse {

    private List<Opportunity> opportunities;

}