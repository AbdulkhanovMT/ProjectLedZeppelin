package com.javarush.abdulkhanov.service;

import com.javarush.abdulkhanov.entity.Product;
import com.javarush.abdulkhanov.exception.ApplicationException;
import com.javarush.abdulkhanov.repository.ProductRepository;

import java.util.Collection;
import java.util.Optional;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Collection<Product> getAll(){
        return productRepository.getAll();
    }

    public void create(Product product){
        Product productTemplate = Product
                .builder()
                .sku(product.getSku())
                .build();
        if(productRepository.find(productTemplate).findAny().isEmpty()){
            productRepository.create(product);
        }
        else{
            throw new ApplicationException("Product with barcode" + productTemplate.getSku() + "already exists");
        }
    }

    public Optional<Product> get(Long id){
        return Optional.ofNullable(productRepository.get(id));
    }

    public Optional<Product> get(String name, String barcode){
        Product possibleProduct = Product.builder()
                .name(name)
                .sku(barcode)
                .build();
        return productRepository.find(possibleProduct).findAny();
    }

    public void update(Product product){
        productRepository.update(product);
    }

    public void delete(Product product){
        productRepository.delete(product);
    }


}
