package com.israel.api.services.inter;

import com.israel.api.dto.UserDto;

public interface UserService {

    UserDto findById(Long id);

}