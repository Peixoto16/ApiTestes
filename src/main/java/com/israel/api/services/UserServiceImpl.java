package com.israel.api.services;

import com.israel.api.model.User;
import com.israel.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;


    @Override
    public User findById(Long id) {

        Optional<User> obj = repository.findById(id);

        return obj.orElse(null);
    }
}
