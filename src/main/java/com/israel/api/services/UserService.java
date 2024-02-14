package com.israel.api.services;

import com.israel.api.model.User;

public interface UserService {

    User findById(Long id);

}