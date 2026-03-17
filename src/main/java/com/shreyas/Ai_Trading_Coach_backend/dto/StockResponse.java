package com.shreyas.Ai_Trading_Coach_backend.dto;

import java.util.Map;

public class StockResponse {

    private String symbol;
    private Map<String, Object> technical;
    private Map<String, Object> news;
    private Map<String, Object> fundamental;
    private String summary;

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public Map<String, Object> getTechnical() { return technical; }
    public void setTechnical(Map<String, Object> technical) { this.technical = technical; }

    public Map<String, Object> getNews() { return news; }
    public void setNews(Map<String, Object> news) { this.news = news; }

    public Map<String, Object> getFundamental() { return fundamental; }
    public void setFundamental(Map<String, Object> fundamental) { this.fundamental = fundamental; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}
