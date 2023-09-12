package com.example.uzummarkets.dto;


import com.example.uzummarkets.entity.UserRole;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserDTO{
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean isBlock;
}

