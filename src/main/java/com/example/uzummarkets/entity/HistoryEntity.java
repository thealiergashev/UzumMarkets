package com.example.uzummarkets.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity(name = "histories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HistoryEntity extends BaseEntity {
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;
    private UUID customer_id;
}
