package com.example.uzummarkets.dto;


import com.example.uzummarkets.entity.UserRole;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO{
    private String name;
    private String username;
    private String password;
    private UserRole role;
    private Boolean isBlock;
}

