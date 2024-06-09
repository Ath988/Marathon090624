package com.atahan.marathon.marathon.service;

import com.atahan.marathon.marathon.entity.Brand;
import com.atahan.marathon.marathon.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class BrandService {
    private final BrandRepository repository;

    public Brand save(BrandSaveRequestDto dto) {
        return repository.save(BrandMapper.INSTANCE.fromBrandSaveDto(dto));
    }

    public List<Brand> getAll() {
        return repository.findAll();
    }
}