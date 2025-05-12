package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
