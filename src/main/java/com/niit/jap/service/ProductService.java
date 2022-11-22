package com.niit.jap.service;

import com.niit.jap.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveData(Product product);

    List<Product> getAll();

    Optional<Product> fetchById(int id);

    String deleteById(int id);

}
