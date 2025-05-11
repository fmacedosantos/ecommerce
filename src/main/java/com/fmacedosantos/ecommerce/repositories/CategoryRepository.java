package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
