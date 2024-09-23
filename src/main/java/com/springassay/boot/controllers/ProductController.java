package com.springassay.boot.controllers;

import java.util.List;
import java.util.UUID;
import java.util.Optional;;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.springassay.boot.dtos.ProductRecordDto;
import com.springassay.boot.models.ProductModel;
import com.springassay.boot.repositories.ProductRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;


@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

        @PostMapping("/products")
        public ResponseEntity<ProductModel> saveProduct (@RequestBody @Valid ProductRecordDto productRecordDto) {
            var productModel = new ProductModel ();
            BeanUtils.copyProperties(productRecordDto, productModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
        }

        @GetMapping("/products")
        public ResponseEntity<List<ProductModel>> getAllProducts() {
            return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
        }
        
        
        @GetMapping ("/products/{id}")
        public ResponseEntity<Object> getOneProduct (@PathVariable(value="id") UUID id){
            Optional <ProductModel> product0 = productRepository.findById(id);
                if (product0.isEmpty()){
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto nao encontrado");
                }
                return ResponseEntity.status(HttpStatus.OK).body(product0.get());
                }
            }
        
