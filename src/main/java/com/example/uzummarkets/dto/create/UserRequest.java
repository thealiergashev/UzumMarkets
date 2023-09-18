package com.example.uzummarkets.dto.create;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserRequest {
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean isBlock;
}

