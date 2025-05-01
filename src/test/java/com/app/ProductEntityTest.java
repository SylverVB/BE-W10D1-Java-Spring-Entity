package com.app;

import com.app.Model.Product;
import com.app.Service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class ProductEntityTest {

    /**
     * Unit test verifying that the Product entity is properly annotated for persistence.
     *
     * The test passes if the ApplicationContext is successfully initialized, which requires the Product
     * entity to be correctly configured. If the Product class is not annotated as an @Entity,
     * the corresponding repository bean cannot be created, causing the context to fail.
     */
    @Test
    public void productEntityTest1() {
        ApplicationContext applicationContext = SpringApplication.run(Application.class);
        ProductService productService = applicationContext.getBean(ProductService.class);
        Product p1 = productService.insertProduct(new Product(1, "Headphones", "Nice headphones"));
        Assertions.assertTrue(productService.getAllProducts().contains(p1));
    }
}