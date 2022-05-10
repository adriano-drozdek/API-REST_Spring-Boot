package com.adriano.usuariodepartamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriano.usuariodepartamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
