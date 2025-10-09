package com.javarush.abdulkhanov.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements AbstractEntity {
    private Long id;
    private Long storeId;
    private String name;
    private String sku;
    private String category;
    private Long totalAmount;
    private Collection<ProductParameter> parameters = new ArrayList<>();
    private Collection<Item>  items = new ArrayList<>();

    public String getImage(){
        return "product-" + this.getId();
    }
}
