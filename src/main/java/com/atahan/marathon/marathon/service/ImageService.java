package com.atahan.marathon.marathon.service;

import com.atahan.marathon.marathon.entity.Image;
import com.atahan.marathon.marathon.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository repository;

    public Image save(ImageSaveRequestDto dto) {
        if (!repository.existMainImage(dto.getProductId()) || dto.getIsMainImage().equals(false)) {
            return repository.save(ImageMapper.INSTANCE.fromImageSaveDto(dto));
        }
        throw new MarathonException(ErrorType.MAIN_IMAGE_ALREADY_EXIST);
    }

    public List<Image> getAll() {
        return repository.findAll();
    }

}