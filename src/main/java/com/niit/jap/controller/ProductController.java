/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.domain.Product;
import com.niit.jap.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private ProductServiceImpl productServiceImpl;

    @Autowired

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @PostMapping("/insertData")
    public ResponseEntity<?> insertFunction(@RequestBody Product product) {
        Product product1 = productServiceImpl.saveData(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/fetchValue")
    public ResponseEntity<?> getFunction() {
        return new ResponseEntity<>(productServiceImpl.getAll(), HttpStatus.OK);
    }

    @GetMapping("/fetchValue/{id}")
    public Optional<Product> fetchFunction(@PathVariable int id) {
        return productServiceImpl.fetchById(id);
    }

    @DeleteMapping("/deleteValue/{id}")
    public String deleteFunction(@PathVariable int id) {
        productServiceImpl.deleteById(id);
        return "Deleted";
    }
}

// @PostMapping("/insertValue")
//    public ResponseEntity<?> addFunction(@RequestBody Student student){
//        Student student1 = studentService.saveStudent(student);
//        return new ResponseEntity<>(student1, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/fetchValue")
//    public ResponseEntity<?> getFunction(){
//        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
//    }
//    @DeleteMapping("/deleteValue/{id}")
//    public String deleteFunction(@PathVariable int id){
//        studentService.delete(id);
//        return "Deleted";
//    }