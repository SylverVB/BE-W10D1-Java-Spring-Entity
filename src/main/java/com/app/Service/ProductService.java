package com.app.Service;

import com.app.Model.Product;
import com.app.Repository.ProductRepository;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Service class demonstrating basic usage of the ProductRepository.
 */
@Component
public class ProductService {
    ProductRepository productRepository;

    // @Autowired is not required if there's only one constructor in the class
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    /**
     * Retrieves all Product entities from the Product table.
     * Equivalent to "SELECT * FROM product".
     */
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    /**
     * Saves a Product entity to the Product table.
     * Equivalent to "INSERT INTO product".
     */
    public Product insertProduct(Product product){
        return productRepository.save(product);
    }

    /**
     * Deletes a Product entity from the Product table.
     * Equivalent to "DELETE FROM product".
     */
    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
}