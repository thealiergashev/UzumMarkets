package com.example.uzummarkets.dto.create;

import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HistoryRequest {
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;
    private UUID customer_id;
}
