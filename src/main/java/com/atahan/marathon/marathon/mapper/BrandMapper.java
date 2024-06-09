package com.atahan.marathon.marathon.mapper;

import com.atahan.marathon.marathon.dto.request.BrandDto;
import com.atahan.marathon.marathon.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand fromBrandSaveDto(BrandDto dto);
}