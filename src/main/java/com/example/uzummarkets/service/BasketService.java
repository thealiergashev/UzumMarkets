package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.BasketRequest;
import com.example.uzummarkets.dto.response.BasketResponse;
import com.example.uzummarkets.entity.BasketEntity;
import com.example.uzummarkets.repository.BasketRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BasketService extends BaseService<
        BasketEntity,
        UUID,
        BasketRepository,
        BasketResponse,
        BasketRequest
        > {

    private final BasketRepository basketRepository;
    public BasketService(BasketRepository repository, ModelMapper modelMapper, BasketRepository basketRepository) {
        super(repository, modelMapper);
        this.basketRepository = basketRepository;
    }

    public BasketEntity save(String productId, String userId) {
        return basketRepository.save(new BasketEntity(UUID.fromString(productId), UUID.fromString(userId)));
    }

    public List<BasketEntity> getAllMyBasket(String userId) {
        return basketRepository.getAllByUser_id(UUID.fromString(userId));
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
