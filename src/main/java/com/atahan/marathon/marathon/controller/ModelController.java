package com.atahan.marathon.marathon.controller;

import ch.qos.logback.core.model.Model;
import com.atahan.marathon.marathon.dto.request.ModelDTO;
import com.atahan.marathon.marathon.service.ModelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.atahan.marathon.marathon.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MODEL)
public class ModelController {
    private final ModelService service;

    @PostMapping(SAVE)
    public ResponseEntity<Model> save(@RequestBody @Valid ModelDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Model>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}