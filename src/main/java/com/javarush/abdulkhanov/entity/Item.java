package com.javarush.abdulkhanov.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item implements AbstractEntity{
    private Long id;
    private long productId;
    private long orderId;
    private ItemState state;
}
