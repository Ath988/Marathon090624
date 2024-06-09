package com.atahan.marathon.marathon.service;

import com.atahan.marathon.marathon.dto.request.ModelDTO;
import com.atahan.marathon.marathon.entity.Brand;
import com.atahan.marathon.marathon.entity.Model;
import com.atahan.marathon.marathon.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;

    public Model save(ModelSaveRequestDto dto) {
        return repository.save(ModelMapper.INSTANCE.fromModelSaveDto(dto));
    }

    public List<Model> getAll() {
        return repository.findAll();
    }
}