package com.atahan.marathon.marathon.service;

import com.atahan.marathon.marathon.dto.request.ProductFeatureDTO;
import com.atahan.marathon.marathon.entity.Product;
import com.atahan.marathon.marathon.entity.ProductFeature;
import com.atahan.marathon.marathon.repository.ProductFeatureRepository;
import com.atahan.marathon.marathon.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductFeatureService {
    private final ProductFeatureRepository repository;

    public Feature save(ProductFeatureDTO dto) {
        return repository.save(ProductFeaturesMApper.INSTANCE.fromProductFeaturesSave(dto));
    }

    public List<Feature> getAll() {
        return repository.findAll();
    }


    public List<Product> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return repository.getAllProductsByFeatures(categoryName, featureName);
    }

    public List<String > getAllFeaturesList() {
        List<Feature> featureList = getAll();
        List<String > features = new ArrayList<>();
        featureList.forEach(x-> {
            for (int i = 0; i < ECategoryName.values().length; i++) {
                features.add(x.getCategoryName().name());
                for (int j = 0; j < featureList.size(); j++) {
                    if (featureList.get(j).getCategoryName().name().equals(x.getCategoryName().name())) {
                        features.add(x.getFeatureName());
                    }
                }
            }
        });
        return features;
    }
}