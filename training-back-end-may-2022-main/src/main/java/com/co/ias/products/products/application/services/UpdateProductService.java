package com.co.ias.products.products.application.services;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.models.ProductDTO;
import com.co.ias.products.products.application.ports.in.UpdateProductUseCase;
import com.co.ias.products.products.application.ports.out.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductService implements UpdateProductUseCase {


    ProductRepository productRepository;
    public UpdateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String excute(ProductDTO productDTO) {
        Product product = productDTO.toDomain();
        productRepository.update(product);
        return "Se Actualizo El Producto";
    }
}
