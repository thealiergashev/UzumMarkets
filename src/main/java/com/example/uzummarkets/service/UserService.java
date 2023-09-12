package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.UserDTO;
import com.example.uzummarkets.entity.UserEntity;
import com.example.uzummarkets.exception.DataNotFoundException;
import com.example.uzummarkets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public UserEntity save(UserDTO userDTO) {
        UserEntity user = modelMapper.map(userDTO, UserEntity.class);
        userRepository.save(user);
        return user;
    }

    public UserEntity signIn(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password).orElseThrow(() -> {
            throw new DataNotFoundException("user not found");
        });
    }

    public void deleteUser(UUID uid) {
        userRepository.deleteById(uid);
    }

}
