package com.example.uzummarkets.controller;

import com.example.uzummarkets.dto.create.ProductRequest;
import com.example.uzummarkets.dto.create.UserRequest;
import com.example.uzummarkets.entity.ProductEntity;
import com.example.uzummarkets.entity.UserEntity;
import com.example.uzummarkets.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ProductEntity> save(
            @RequestBody ProductRequest productRequest
    ) {
        return ResponseEntity.ok(productService.save(productRequest));
    }


}
