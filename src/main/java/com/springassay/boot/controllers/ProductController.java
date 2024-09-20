package com.springassay.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springassay.boot.repositories.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

}
