package com.Magdiel.Tudo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Magdiel.Tudo.Domain.Todo;
import com.Magdiel.Tudo.services.TodoService;

@RestController
@RequestMapping(value = "/todos")
public class TodoResource {
	@Autowired
	private TodoService service;
	@GetMapping(value = "/{id}")
	public ResponseEntity<Todo> findById(@PathVariable Integer id){
		Todo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
