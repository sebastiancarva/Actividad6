package com.co.ias.products.products.application.services;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.models.ProductDTO;
import com.co.ias.products.products.application.ports.out.ProductRepository;

public class DeleteProductService {
    private final ProductRepository productRepository;

    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String excute(Integer id) {

        ProductId product;
        product = new ProductId(id);
        productRepository.delete(product);
        return "Se Elimino El Producto con el id " + product;
    }
}
