package com.Magdiel.Tudo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Magdiel.Tudo.Domain.Todo;
import com.Magdiel.Tudo.repositories.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
