package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String brandName;
    private String model;
    private String unitPrice;
    private String productCondition;
    private String privacy;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
