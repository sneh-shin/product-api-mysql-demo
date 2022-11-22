package com.niit.jap.service;

import com.niit.jap.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveData(Product product);

    List<Product> getAll();

    Product getById(int id);

    String deleteById(int id);

}
