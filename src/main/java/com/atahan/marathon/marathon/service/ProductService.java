package com.atahan.marathon.marathon.service;


import com.atahan.marathon.marathon.dto.request.ProductDto;
import com.atahan.marathon.marathon.entity.Product;
import com.atahan.marathon.marathon.mapper.ProductMapper;
import com.atahan.marathon.marathon.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final ProductFeatureService featureService;

    public Product save(ProductDto dto) {
        return repository.save(ProductMapper.INSTANCE.fromProductSaveDto(dto));
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public List<Product> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return featureService.getAllProductsByFeatures(categoryName, featureName);
    }
}