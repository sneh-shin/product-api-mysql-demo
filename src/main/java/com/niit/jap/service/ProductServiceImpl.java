/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.service;

import com.niit.jap.domain.Product;
import com.niit.jap.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveData(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public String deleteById(int id) {
        return null;
    }
}
