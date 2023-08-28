package com.example.uzummarkets.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HistoryDTO {
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;
    private UUID customer_id;
}
