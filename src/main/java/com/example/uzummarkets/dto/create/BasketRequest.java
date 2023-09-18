package com.example.uzummarkets.dto.create;

import lombok.*;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BasketRequest {
    private UUID product_id;
    private UUID user_id;
}
