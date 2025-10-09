package com.javarush.abdulkhanov.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductParameter implements AbstractEntity {
    private Long id;
    private String name;
    private String value;
    private String typeOfParameter;
}
