package com.example.uzummarkets.controller;

import com.example.uzummarkets.entity.BasketEntity;
import com.example.uzummarkets.entity.HistoryEntity;
import com.example.uzummarkets.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/history")
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping("/get-all")
    public ResponseEntity<List<HistoryEntity>> getAllMyHistory(
            @RequestParam String userId
    ) {
        return ResponseEntity.ok(historyService.getAllMyHistory(userId));
    }

}
