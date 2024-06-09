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
public class ModelDTO {
    @NotNull
    private String name;
    @Size(min = 8, max = 64)
    private String modelCode;
    @NotNull
    private Long brandId;
}
