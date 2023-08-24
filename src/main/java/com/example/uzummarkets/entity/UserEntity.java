package com.example.uzummarkets.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity extends BaseEntity {
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private Boolean isBlock;


}
