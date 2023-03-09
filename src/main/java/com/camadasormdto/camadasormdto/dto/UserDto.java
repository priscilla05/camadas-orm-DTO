package com.camadasormdto.camadasormdto.dto;

import com.camadasormdto.camadasormdto.entities.User;

public class UserDto {

    private Long id;
    private String name;

    public UserDto(){

    }

    public UserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDto(User user) {   //construtor que receba entidade para
        // facilitar a minha conversão de entidades para dto

        id = user.getId();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
