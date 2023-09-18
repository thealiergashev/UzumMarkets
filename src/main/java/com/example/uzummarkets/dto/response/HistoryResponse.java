package com.example.uzummarkets.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HistoryResponse {
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;
    private UUID customer_id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
