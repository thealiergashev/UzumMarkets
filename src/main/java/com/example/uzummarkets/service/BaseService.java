package com.example.uzummarkets.service;


import com.example.uzummarkets.entity.BaseEntity;
import com.example.uzummarkets.exception.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public abstract class BaseService<
        E extends BaseEntity,
        ID, REP extends JpaRepository<E, ID>,
        RES, CR
        > {
    protected final REP repository;
    protected final ModelMapper modelMapper;

    public RES create(CR createReq) {
        E entity = mapCRToEntity(createReq);
        repository.save(entity);
        return mapEntityToRES(entity);
    }

    public RES findById(ID id) {
        E entity = repository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("resource with id: " + id + " not found"));
        return mapEntityToRES(entity);
    }

    public List<RES> getAll(int pageNumber, int size) {
        Pageable pageable = PageRequest.of(pageNumber, size);

        Page<E> page = repository.findAll(pageable);
//        List<E> all = page.getContent();

        return page.get().map(this::mapEntityToRES).toList();
//        List<RES> responseList = new ArrayList<>();
//        repository.findAll(pageable).forEach(entity -> {
//            responseList.add(mapEntityToRES(entity));
//        });
//        return responseList;
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    protected abstract RES mapEntityToRES(E entity);

    protected abstract E mapCRToEntity(CR createReq);
}
