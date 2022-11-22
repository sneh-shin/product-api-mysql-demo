/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    int productId;
    String productName;
    String productDescription;
    int amountInStock;
}