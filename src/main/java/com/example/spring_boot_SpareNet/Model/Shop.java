package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;
    private String shopName;
    private String shopAddress;
    private String ownerName;
    private String shopPhoneNumber;
    private String shopEmail;
    private String status;
    private String registeredDate;

    @OneToMany(mappedBy = "shop")
    private List<Order> orders;
}
