package com.example.uzummarkets.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity(name = "baskets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BasketEntity extends BaseEntity{
    private UUID product_id;
    private UUID user_id;
}
