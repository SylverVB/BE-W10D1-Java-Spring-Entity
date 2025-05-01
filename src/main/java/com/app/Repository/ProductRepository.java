package com.app.Repository;

import com.app.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Defines a JPARepository interface for the Product entity.
 *
 * When the application starts, Spring will initialize this interface as a usable Bean that can perform basic
 * database operations such as saving, deleting, updating, and querying Product records. The Product table in the
 * database corresponds to the Product class in Java.
 *
 * Spring manages the conversion between database records and Java objects using Object Relational Mapping (ORM).
 * Configuration details for the database are defined in the application.properties file under src/main/resources.
 *
 * The JPARepository requires two generic types: the entity class (Product) and the type of its primary key (Long).
 *
 * This interface does not require manual modification or annotations such as @Component or @Repository,
 * as those are inherited from JpaRepository.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}