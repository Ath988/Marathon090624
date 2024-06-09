package com.atahan.marathon.marathon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblproduct")

public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // ID için otomatik artan bir HB sequence oluşturur.
        private Long id;
        private String name;
        private Double price;
        private Double reviewRate;
        private Integer stock;
        private String barcode;
        private Long brandId;
        private Long modelId;
}