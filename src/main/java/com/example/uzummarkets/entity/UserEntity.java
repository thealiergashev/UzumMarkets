package com.example.uzummarkets.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserEntity extends BaseEntity {
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean isBlock;


}
