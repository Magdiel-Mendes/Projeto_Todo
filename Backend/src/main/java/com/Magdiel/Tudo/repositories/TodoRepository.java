package com.Magdiel.Tudo.repositories;

import org.springframework.stereotype.Repository;

import com.Magdiel.Tudo.Domain.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
