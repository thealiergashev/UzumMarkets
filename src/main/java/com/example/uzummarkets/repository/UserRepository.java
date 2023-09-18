package com.example.uzummarkets.repository;

import com.example.uzummarkets.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByEmailAndPassword(String email, String password);
//    List<UserEntity> searchAllByNameContaining(String name);



}
