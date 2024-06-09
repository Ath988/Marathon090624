package com.atahan.marathon.marathon.mapper;

import ch.qos.logback.core.model.Model;
import com.atahan.marathon.marathon.dto.request.ModelDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    Model fromModelSaveDto (ModelDTO dto);
}