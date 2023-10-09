package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.ProductRequest;
import com.example.uzummarkets.dto.response.ProductResponse;
import com.example.uzummarkets.entity.ProductEntity;
import com.example.uzummarkets.entity.UserEntity;
import com.example.uzummarkets.repository.ProductRepository;
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

    private final ProductRepository productRepository;
    public ProductService(ProductRepository repository, ModelMapper modelMapper, ProductRepository productRepository) {
        super(repository, modelMapper);
        this.productRepository = productRepository;
    }

    @Override
    protected ProductResponse mapEntityToRES(ProductEntity entity) {
        return null;
    }

    @Override
    protected ProductEntity mapCRToEntity(ProductRequest createReq) {
        return null;
    }

    public ProductEntity save(ProductRequest productRequest) {
        ProductEntity product = modelMapper.map(productRequest, ProductEntity.class);
        return productRepository.save(product);
    }
}
