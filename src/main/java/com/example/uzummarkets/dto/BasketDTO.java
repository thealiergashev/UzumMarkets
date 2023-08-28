package com.example.uzummarkets.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BasketDTO {
    private UUID product_id;
    private UUID user_id;
}
