package com.adriano.usuariodepartamento.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriano.usuariodepartamento.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	public List<User> findAll(){
		
	}
}
