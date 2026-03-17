package com.shreyas.Ai_Trading_Coach_backend.dto;


import java.util.List;

public class ScanResponse {

    private List<Opportunity> opportunities;

    public List<Opportunity> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(List<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }
}