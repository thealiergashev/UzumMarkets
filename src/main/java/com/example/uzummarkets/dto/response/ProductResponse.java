package com.example.uzummarkets.dto.response;

import com.example.uzummarkets.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse{
    private String name;
    private Double price;
    private Integer amount;
    private String category_name;
    private UUID owner_id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
