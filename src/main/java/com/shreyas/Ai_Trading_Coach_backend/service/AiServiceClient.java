package com.shreyas.Ai_Trading_Coach_backend.service;

import com.shreyas.Ai_Trading_Coach_backend.dto.ScanResponse;
import com.shreyas.Ai_Trading_Coach_backend.dto.StockResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class AiServiceClient {

    private final RestTemplate restTemplate;

    public AiServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // 🔹 Stock Analysis
    public StockResponse analyzeStock(String symbol) {

        String url = "http://localhost:8000/analyze-stock/" + symbol;

        ResponseEntity<StockResponse> response =
                restTemplate.getForEntity(url, StockResponse.class);

        return response.getBody();
    }

    // 🔹 Market Scan
    public ScanResponse scanMarket() {

        String url = "http://localhost:8000/scan-market";

        ResponseEntity<ScanResponse> response =
                restTemplate.getForEntity(url, ScanResponse.class);

        return response.getBody();
    }
}