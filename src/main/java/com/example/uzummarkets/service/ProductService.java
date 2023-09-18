package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.ProductRequest;
import com.example.uzummarkets.dto.response.ProductResponse;
import com.example.uzummarkets.entity.ProductEntity;
import com.example.uzummarkets.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService extends BaseService<
        ProductEntity,
        UUID,
        ProductRepository,
        ProductResponse,
        ProductRequest
        >{

    public ProductService(ProductRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected ProductResponse mapEntityToRES(ProductEntity entity) {
        return null;
    }

    @Override
    protected ProductEntity mapCRToEntity(ProductRequest createReq) {
        return null;
    }
}
