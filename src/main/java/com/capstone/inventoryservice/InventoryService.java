package com.capstone.inventoryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    private final ProductRepository productRepository;

    @Autowired
    public InventoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public String addProduct(Product product){

        try {
            productRepository.save(product);
            return "Product added successfully";
        }
        catch(Exception e){
            return "Failed to add product";
        }
    }
}
