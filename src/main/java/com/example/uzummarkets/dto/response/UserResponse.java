package com.example.uzummarkets.dto.response;

import com.example.uzummarkets.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserResponse {
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean isBlock;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
