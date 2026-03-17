package com.shreyas.Ai_Trading_Coach_backend.dto;

public class Opportunity {

    private String symbol;
    private String sector;
    private double score;
    private double momentum;
    private String summary;

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public double getMomentum() { return momentum; }
    public void setMomentum(double momentum) { this.momentum = momentum; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}