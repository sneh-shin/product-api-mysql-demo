/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private ProductServiceImpl productServiceImpl;

    @Autowired

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }
}
