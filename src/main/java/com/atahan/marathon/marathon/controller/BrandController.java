package com.atahan.marathon.marathon.controller;


import com.atahan.marathon.marathon.dto.request.BrandDto;
import com.atahan.marathon.marathon.entity.Brand;
import com.atahan.marathon.marathon.service.BrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.atahan.marathon.marathon.config.RestApis.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(BRAND)
public class BrandController {
    private final BrandService service;

    @PostMapping(SAVE)
    public ResponseEntity<Brand> save(@RequestBody @Valid BrandDto dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Brand>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
