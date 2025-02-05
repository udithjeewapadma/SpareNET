package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FriendlyShopList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopListId;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
