package com.israel.api.controller;

import com.israel.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(value = "/{id}")
        public ResponseEntity<User> findById( @PathVariable Long id){

        return ResponseEntity.ok().body(new User(10L, "Valdir", "val@mail.com", "123"));
    }



}
