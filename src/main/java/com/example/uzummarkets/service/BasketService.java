package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.BasketRequest;
import com.example.uzummarkets.dto.response.BasketResponse;
import com.example.uzummarkets.entity.BasketEntity;
import com.example.uzummarkets.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BasketService extends BaseService<
        BasketEntity,
        UUID,
        BasketRepository,
        BasketResponse,
        BasketRequest
        > {
    public BasketService(BasketRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected BasketResponse mapEntityToRES(BasketEntity entity) {
        return null;
    }

    @Override
    protected BasketEntity mapCRToEntity(BasketRequest createReq) {
        return null;
    }
}
