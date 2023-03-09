package com.camadasormdto.camadasormdto.repositories;

import com.camadasormdto.camadasormdto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
