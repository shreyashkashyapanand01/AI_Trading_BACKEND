package com.shreyas.Ai_Trading_Coach_backend.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeDTO {

    private String symbol;
    @JsonProperty("entry_price")
    private double entryPrice;

    @JsonProperty("exit_price")
    private double exitPrice;

    private int quantity;

    private String type;
    private String side;

    @JsonProperty("holdingMinutes")
    private double holdingMinutes;

    @JsonProperty("profitLoss")
    private double profitLoss;
    // Getters & Setters

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public double getEntryPrice() { return entryPrice; }
    public void setEntryPrice(double entryPrice) { this.entryPrice = entryPrice; }

    public double getExitPrice() { return exitPrice; }
    public void setExitPrice(double exitPrice) { this.exitPrice = exitPrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }

    public double getHoldingMinutes() { return holdingMinutes; }
    public void setHoldingMinutes(double holdingMinutes) { this.holdingMinutes = holdingMinutes; }

    public double getProfitLoss() { return profitLoss; }
    public void setProfitLoss(double profitLoss) { this.profitLoss = profitLoss; }
}