package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ShopRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private Long senderShopId;
    private Long receiverShopId;
    private LocalDate requestDate;
    private String requestStatus;

    @ManyToMany(mappedBy = "shopRequests")
    private List<Shop> shops;

}
