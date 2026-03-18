package com.shreyas.Ai_Trading_Coach_backend.dto.response;

import java.util.List;
import java.util.Map;

public class TradeAnalysisResponse {

    private String analysisId;
    private String generatedAt;
    private int riskScore;
    private String traderType;
    private List<String> mistakes;
    private Map<String, Object> metrics;
    private String summary;
    private List<String> suggestions;

    // Getters & Setters

    public String getAnalysisId() { return analysisId; }
    public void setAnalysisId(String analysisId) { this.analysisId = analysisId; }

    public String getGeneratedAt() { return generatedAt; }
    public void setGeneratedAt(String generatedAt) { this.generatedAt = generatedAt; }

    public int getRiskScore() { return riskScore; }
    public void setRiskScore(int riskScore) { this.riskScore = riskScore; }

    public String getTraderType() { return traderType; }
    public void setTraderType(String traderType) { this.traderType = traderType; }

    public List<String> getMistakes() { return mistakes; }
    public void setMistakes(List<String> mistakes) { this.mistakes = mistakes; }

    public Map<String, Object> getMetrics() { return metrics; }
    public void setMetrics(Map<String, Object> metrics) { this.metrics = metrics; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public List<String> getSuggestions() { return suggestions; }
    public void setSuggestions(List<String> suggestions) { this.suggestions = suggestions; }
}