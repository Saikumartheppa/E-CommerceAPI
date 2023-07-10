package com.saikumar.ECommerce.Application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer productQuantity;
    @OneToOne
    @JoinColumn(name = "fk_user_Id")
    User user;
    @OneToOne
    @JoinColumn(name = "fk_product_Id")
    Product product;
    @OneToOne
    @JoinColumn(name = "fk_address_Id")
    Address address;

}
