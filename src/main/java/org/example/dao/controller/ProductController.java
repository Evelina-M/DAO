package org.example.dao.controller;

import org.example.dao.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name", required = false) String name) {
        return productService.getProductName(name);
    }

}
