package com.co.ias.products.products.application.services;

import com.co.ias.products.products.application.ports.out.ProductRepository;
import org.springframework.stereotype.Repository;

public class UpdateProductService {

    public final ProductRepository productRepository;

    public UpdateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
