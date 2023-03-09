package com.camadasormdto.camadasormdto.services;

import com.camadasormdto.camadasormdto.dto.UserDto;
import com.camadasormdto.camadasormdto.entities.User;
import com.camadasormdto.camadasormdto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDto findById(Long id) {
        User entity = repository.findById(id).get();
        UserDto dto = new UserDto(entity);
        return dto;
    }
}
