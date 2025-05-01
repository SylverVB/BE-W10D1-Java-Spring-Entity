package com.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

/**
 * This class is mapped to a relational database table using Spring's Object Relational Mapping (ORM).
 * ORM enables interaction with the database through Java objects instead of manual SQL statements.
 * 
 * The @Entity annotation designates this class as a database entity. One of its fields, such as productID,
 * must be annotated with @Id to serve as the primary key. Other fields are automatically mapped to columns
 * in the corresponding table.
 *
 * Hibernate is the default ORM provider used by Spring Data and handles the translation between Java objects
 * and database records.
 *
 * For more information on Spring Data JPA and entity configuration, refer to:
 * https://spring.io/guides/gs/accessing-data-jpa/
 */
@Entity
public class Product {

    /** Primary key for the Product table. */
    @Id
    private long productID;

    /** Name of the product. */
    private String name;

    /** Description of the product. */
    private String description;

    public Product(long productID, String name, String description) {
        this.productID = productID;
        this.name = name;
        this.description = description;
    }

    public Product(){

    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Overrides the default equality check with a deep equivalence check for all fields.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}