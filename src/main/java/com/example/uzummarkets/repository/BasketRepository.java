package com.example.uzummarkets.repository;

import com.example.uzummarkets.entity.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BasketRepository extends JpaRepository<BasketEntity, UUID> {
    List<BasketEntity> getAllByUser_id(UUID userId);
}
