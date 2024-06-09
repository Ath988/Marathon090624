package com.atahan.marathon.marathon.mapper;

import com.atahan.marathon.marathon.dto.request.ProductDto;
import com.atahan.marathon.marathon.dto.request.ProductFeatureDTO;
import com.atahan.marathon.marathon.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductFeaturesMApper {
    ProductFeaturesMApper INSTANCE = Mappers.getMapper(ProductFeaturesMApper.class);

    Feature fromProductFeaturesSave(ProductFeatureDTO dto);
}