package com.atahan.marathon.marathon.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageDto {
    private String name;
    private String imageUrl;
    private Boolean isMainImage;
    private Long productId;
}
