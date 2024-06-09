package com.atahan.marathon.marathon.repository;

import com.atahan.marathon.marathon.entity.Brand;
import com.atahan.marathon.marathon.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
