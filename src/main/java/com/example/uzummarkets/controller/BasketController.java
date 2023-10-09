package com.example.uzummarkets.controller;

import com.example.uzummarkets.entity.BasketEntity;
import com.example.uzummarkets.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/basket")
public class BasketController {
    private final BasketService basketService;

    @PostMapping("/save-basket")
    public ResponseEntity<BasketEntity> save(
            @RequestParam String productId,
            @RequestParam String userId
    ) {
        return ResponseEntity.ok(basketService.save(productId, userId));
    }

    @GetMapping("/get-my-basket")
    public ResponseEntity<List<BasketEntity>> getAllMyBasket(
            @RequestParam String userId
    ) {
        return ResponseEntity.ok(basketService.getAllMyBasket(userId));
    }
}
