package com.example.myapps.restgroovy.modules.todo.repository

import com.example.myapps.restgroovy.modules.todo.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository extends JpaRepository<Todo, Integer> {

}