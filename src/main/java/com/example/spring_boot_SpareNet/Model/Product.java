package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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
    private String productCondition;
    private String privacy;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToMany(mappedBy = "products")
    private List<Inventory> inventories;

    @ManyToMany(mappedBy = "products")
    private List<Order> orders;

}
