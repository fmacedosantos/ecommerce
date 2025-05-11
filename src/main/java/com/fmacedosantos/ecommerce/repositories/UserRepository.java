package com.fmacedosantos.ecommerce.repositories;

import com.fmacedosantos.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui a anotação @Repository não é necessária, visto que a interface herda de JpaRepository, que já é registrada
public interface UserRepository extends JpaRepository<User, Long> {
}
