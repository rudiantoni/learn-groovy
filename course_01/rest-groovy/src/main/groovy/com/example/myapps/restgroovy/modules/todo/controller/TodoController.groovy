package com.example.myapps.restgroovy.modules.todo.controller

import com.example.myapps.restgroovy.modules.todo.entity.Todo
import com.example.myapps.restgroovy.modules.todo.service.TodoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.nio.file.Path

@RestController
@RequestMapping('/todo')
class TodoController {
    TodoService todoService
    TodoController(
        TodoService todoService
    ) {
        this.todoService = todoService
    }

    @GetMapping('')
    List<Todo> getAllTodoList() {
        todoService.findAll()
    }

    @PostMapping('')
    Todo saveTodo(
        @RequestBody Todo todo
    ) {
        todoService.saveTodo todo
    }

    @PutMapping('')
    Todo updateTodo(
        @RequestBody Todo todo
    ) {
        todoService.updateTodo todo
    }

    @DeleteMapping('/{todoId}')
    def deleteTodo(
        @PathVariable Integer todoId
    ) {
        todoService.deleteTodo todoId
    }

    @GetMapping('/{todoId}')
    Todo getTodoById(
        @PathVariable Integer todoId
    ) {
        todoService.findById todoId
    }

}
