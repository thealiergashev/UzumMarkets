package com.example.uzummarkets.repository;

import com.example.uzummarkets.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByEmailAndPassword(String email, String password);
//    List<UserEntity> searchAllByNameContaining(String name);



}
