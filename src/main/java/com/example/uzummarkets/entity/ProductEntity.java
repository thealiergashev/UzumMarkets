package com.example.uzummarkets.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductEntity extends BaseEntity {
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;


}
