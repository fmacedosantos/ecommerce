package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
