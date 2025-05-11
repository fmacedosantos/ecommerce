package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
