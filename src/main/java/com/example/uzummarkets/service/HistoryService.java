package com.example.uzummarkets.service;

import com.example.uzummarkets.dto.create.HistoryRequest;
import com.example.uzummarkets.dto.response.HistoryResponse;
import com.example.uzummarkets.entity.HistoryEntity;
import com.example.uzummarkets.repository.HistoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HistoryService extends BaseService<
        HistoryEntity,
        UUID,
        HistoryRepository,
        HistoryResponse,
        HistoryRequest
        >{
    private final HistoryRepository historyRepository;
    public HistoryService(HistoryRepository repository, ModelMapper modelMapper, HistoryRepository historyRepository) {
        super(repository, modelMapper);
        this.historyRepository = historyRepository;
    }

    @Override
    protected HistoryResponse mapEntityToRES(HistoryEntity entity) {
        return null;
    }

    @Override
    protected HistoryEntity mapCRToEntity(HistoryRequest createReq) {
        return null;
    }

    public List<HistoryEntity> getAllMyHistory(String userId) {
        return historyRepository.getAllByCustomer_id(UUID.fromString(userId));
    }
}
