package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String adminName;
    private String phoneNumber;

    @OneToMany(mappedBy = "admin")
    private List<RequestProduct> requestProducts;

    @OneToMany(mappedBy = "admin")
    private List<Shop> shops;

    @OneToMany(mappedBy = "admin")
    private List<Product> products;
}
