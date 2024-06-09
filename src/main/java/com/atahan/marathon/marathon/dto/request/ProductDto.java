package com.atahan.marathon.marathon.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {
    @NotNull
    private String name;
    @NotNull
    private Double price;
    private Double taxRate;
    private Integer stock;
    private String barcode;
    private Long brandId;
    private Long modelId;

}
