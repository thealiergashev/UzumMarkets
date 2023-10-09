package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.UserRequest;
import com.example.uzummarkets.dto.response.UserResponse;
import com.example.uzummarkets.entity.UserEntity;
import com.example.uzummarkets.exception.DataNotFoundException;
import com.example.uzummarkets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UserService extends BaseService<
        UserEntity,
        UUID,
        UserRepository,
        UserResponse,
        UserRequest
        >{
    private final UserRepository userRepository;

    public UserService(UserRepository repository, ModelMapper modelMapper, UserRepository userRepository) {
        super(repository, modelMapper);
        this.userRepository = userRepository;
    }

    public UserEntity save(UserRequest userDTO) {
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

    @Override
    protected UserResponse mapEntityToRES(UserEntity entity) {
        return null;
    }

    @Override
    protected UserEntity mapCRToEntity(UserRequest createReq) {
        return null;
    }
}
