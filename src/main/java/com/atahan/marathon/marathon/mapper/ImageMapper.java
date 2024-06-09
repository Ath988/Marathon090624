package com.atahan.marathon.marathon.mapper;

import com.atahan.marathon.marathon.dto.request.ImageDto;
import com.atahan.marathon.marathon.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper {
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    Image fromImageSaveDto(ImageDto dto);
}