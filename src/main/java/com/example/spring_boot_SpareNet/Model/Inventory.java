package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
}
