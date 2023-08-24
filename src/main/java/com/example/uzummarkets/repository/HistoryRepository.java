package com.example.uzummarkets.repository;

import com.example.uzummarkets.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HistoryRepository extends JpaRepository<HistoryEntity, UUID> {
}
