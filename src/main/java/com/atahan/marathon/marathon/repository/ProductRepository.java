package com.atahan.marathon.marathon.repository;

import com.atahan.marathon.marathon.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByFeaturesCategoryAndFeaturesFeature(String category, String feature);
}
