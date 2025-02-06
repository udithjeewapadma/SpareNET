package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Inventory {
    @Id
    private Long inventoryId;
    private Double unitPrice;
    private int quantity;
    private String visibilityStatus;


    @OneToMany(mappedBy = "inventory")
    private List<Shop> shops;

    @ManyToMany
    @JoinTable(
            name = "inventory_products",
            joinColumns = @JoinColumn(name = "inventory_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}
