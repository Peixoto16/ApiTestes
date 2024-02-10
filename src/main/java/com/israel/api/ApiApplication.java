package com.israel.api;

import com.israel.api.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiApplication.class, args);

      // User user = new User(10L, "valdir", "email@email.com", "123");
    }

}
