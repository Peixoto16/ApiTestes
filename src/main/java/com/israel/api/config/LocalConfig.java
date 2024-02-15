package com.israel.api.config;


import com.israel.api.model.User;
import com.israel.api.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB() {

        User u1 = new User(null, "Valdir", "valdir@mail", "123");
        User u2 = new User(null, "Luiz", "luiz@mail", "321");

        repository.saveAll(List.of(u1, u2));
    }





}
