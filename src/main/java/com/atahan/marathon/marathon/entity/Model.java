package com.atahan.marathon.marathon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString
@AllArgsConstructor // parametreli constructorların tümü
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl_model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID için otomatik artan bir HB sequence oluşturur.
    private Long id;
    private String name;
    private String modelCode;
    private Long brandId;
}
