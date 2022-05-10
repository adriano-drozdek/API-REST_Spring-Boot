package com.adriano.usuariodepartamento.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriano.usuariodepartamento.entities.User;
import com.adriano.usuariodepartamento.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private UserRepository repository;
	public List<User> findAll(){
		
	}
}
