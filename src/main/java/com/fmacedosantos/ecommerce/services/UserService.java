package com.fmacedosantos.ecommerce.services;

import com.fmacedosantos.ecommerce.entities.User;
import com.fmacedosantos.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Component // Registra a classe como um componente do Spring, permitindo a injeção de dependência
@Service // Essa é uma anotação mais específica, mas é mais semântico
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);

        return user.get();
    }
}
