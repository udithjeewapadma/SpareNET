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

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @OneToMany(mappedBy = "shop")
    private List<RequestProduct> requestProductList;

    @ManyToMany
    @JoinTable(
            name = "friendly_shop",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "friendly_shop_id")
    )
    private List<Shop> friendlyShops;


    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToMany
    @JoinTable(
            name = "shop_requests",
            joinColumns = @JoinColumn(name = "shop_id"),
            inverseJoinColumns = @JoinColumn(name = "request_id")
    )
    private List<ShopRequest> shopRequests;


}
