package com.israel.api.services;


import com.israel.api.dto.UserDto;
import com.israel.api.model.User;
import com.israel.api.repository.UserRepository;
import com.israel.api.services.exception.ObjectNotFoundException;
import com.israel.api.services.inter.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public UserDto findById(Long id) {
        Optional<User> optionalUser = repository.findById(id);
        User user = optionalUser.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

        // Mapeia o objeto User para UserDto usando o ModelMapper
        return mapper.map(user, UserDto.class);
    }
}
