package com.example.uzummarkets.repository;

import com.example.uzummarkets.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntity, UUID> {
    List<HistoryEntity> getAllByCustomer_id(UUID customerID);
}
