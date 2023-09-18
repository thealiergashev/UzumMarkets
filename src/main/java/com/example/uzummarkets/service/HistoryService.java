package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.HistoryRequest;
import com.example.uzummarkets.dto.response.HistoryResponse;
import com.example.uzummarkets.entity.HistoryEntity;
import com.example.uzummarkets.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HistoryService extends BaseService<
        HistoryEntity,
        UUID,
        HistoryRepository,
        HistoryResponse,
        HistoryRequest
        >{
    public HistoryService(HistoryRepository repository, ModelMapper modelMapper) {
        super(repository, modelMapper);
    }

    @Override
    protected HistoryResponse mapEntityToRES(HistoryEntity entity) {
        return null;
    }

    @Override
    protected HistoryEntity mapCRToEntity(HistoryRequest createReq) {
        return null;
    }
}
