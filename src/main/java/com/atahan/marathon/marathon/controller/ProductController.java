package com.atahan.marathon.marathon.controller;

import com.atahan.marathon.marathon.dto.request.ProductDto;
import com.atahan.marathon.marathon.entity.Product;
import com.atahan.marathon.marathon.exception.ErrorType;
import com.atahan.marathon.marathon.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.atahan.marathon.marathon.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCT)
public class ProductController {
    private final ProductService service;

    @PostMapping(SAVE)
    public ResponseEntity<Product> save(@RequestBody @Valid ProductDto dto) {
        if (Objects.isNull(dto.getName())) {
            if (Objects.isNull(dto.getBrandId()) || Objects.isNull(dto.getModelId())) {
                throw new RuntimeException(ErrorType.INVALID_REQUEST.toString());
            }
        }
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(GETALLPRODUCTBYFEATURES)
    public ResponseEntity<List<Product>> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return ResponseEntity.ok(service.getAllProductsByFeatures(categoryName, featureName));
    }
}