package com.atahan.marathon.marathon.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BrandDto {
    @NotNull
    private String name;
    @Size(min = 8, max = 64)
    private String brandCode;

    // Getters and Setters
}