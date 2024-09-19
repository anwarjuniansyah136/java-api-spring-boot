package com.security.api1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Coba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
