package com.app;

import com.app.Model.Product;
import com.app.Service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Main class for launching the Spring Boot application.
 */

@SpringBootApplication
@SuppressWarnings("unused")
public class Application {
    
    /**
     * The main method initializes the Spring application context.
     * If a long stack trace of errors appears instead of normal output, it may indicate that
     * Spring beans failed to load due to issues such as incorrect setup of the Product entity,
     * which prevents the JPARepository from initializing.
     *
     * A successful run of this method confirms that the database and entity mappings are correctly configured.
     */
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(Application.class);
        ProductService productService = applicationContext.getBean(ProductService.class);
        String output = "\n";
        output+=("\nIf you're seeing this message, the database & entities were probably correctly set up.");
        output+=("\nLet's try inserting some items.");
        Product p1 = productService.insertProduct(new Product(1, "Headphones", "Nice headphones"));
        Product p2 = productService.insertProduct(new Product(2, "Phone", "A smartphone"));
        Product p3 = productService.insertProduct(new Product(3, "Swag", "Some other swag"));
        output+=("\nLet's check the current contents of the Product table.");
        output+=("\n"+productService.getAllProducts());
        output+=("\nLet's see the contents of the Product table after I delete the product.");
        productService.deleteProduct(p2);
        output+=("\n"+productService.getAllProducts()+"\n");
        SpringApplication.exit(applicationContext);
        System.out.println(output);
    }
}