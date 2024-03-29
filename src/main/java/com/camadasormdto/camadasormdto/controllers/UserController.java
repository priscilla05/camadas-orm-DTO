package com.camadasormdto.camadasormdto.controllers;

import com.camadasormdto.camadasormdto.dto.UserDto;
import com.camadasormdto.camadasormdto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public UserDto findById(@PathVariable Long id) {
        return service.findById(id);


    }


}
