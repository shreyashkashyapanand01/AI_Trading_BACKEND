package com.shreyas.Ai_Trading_Coach_backend.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
public class StockResponse {

    private String symbol;
    private Map<String, Object> technical;
    private Map<String, Object> news;
    private Map<String, Object> fundamental;
    private String summary;

}