package com.shreyas.Ai_Trading_Coach_backend.dto.request;

import java.util.List;

public class TradeUploadRequest {

    private List<TradeDTO> trades;

    public List<TradeDTO> getTrades() {
        return trades;
    }

    public void setTrades(List<TradeDTO> trades) {
        this.trades = trades;
    }
}