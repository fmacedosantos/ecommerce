package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
