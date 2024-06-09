package com.atahan.marathon.marathon.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductFeatureDTO {
     @NotNull
     private ECategoryName categoryName;
     private String featureName;
     private String description;
     private Long productId;

}
