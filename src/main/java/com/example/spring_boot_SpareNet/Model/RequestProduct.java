package com.example.spring_boot_SpareNet.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RequestProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestProductId;
    private String productName;
    private String brandName;
    private String modelName;
    private int manufacturedYear;
    private String status;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
}
