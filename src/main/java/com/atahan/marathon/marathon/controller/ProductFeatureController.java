package com.atahan.marathon.marathon.controller;

import com.atahan.marathon.marathon.dto.request.ProductFeatureDTO;
import com.atahan.marathon.marathon.entity.ProductFeature;
import com.atahan.marathon.marathon.service.ProductFeatureService;
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
@RequestMapping(PRODUCTFEATURES)
public class FeatureController {
    private final ProductFeatureService service;

    @PostMapping(SAVE)
    public ResponseEntity<Feature> save(@RequestBody @Valid ProductFeatureDTO dto) {
        if (Objects.isNull(dto.getProductId())) {
            throw new MarathonException(ErrorType.PRODUCT_FEATURES_INVALID_PARAMETER_ERROR);
        }
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Feature>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(GETALLFEATURESLIST)
    public ResponseEntity<List<String >> getAllFeaturesList(){
        return ResponseEntity.ok(service.getAllFeaturesList());
    }



}