package com.example.myapps.restgroovy.modules.todo.service

import com.example.myapps.restgroovy.modules.todo.entity.Todo
import com.example.myapps.restgroovy.modules.todo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService {
    TodoRepository todoRepository
    TodoService(
        TodoRepository todoRepository
    ) {
        this.todoRepository = todoRepository
    }

    // @Autowired TodoRepository todoRepository

    List<Todo> findAll() {
        todoRepository.findAll()
        //return todoRepository.findAll()
    }

    Todo findById(Integer todoId) {
        todoRepository.findById todoId get()
        //return todoRepository.findById(todoId).get()
    }

    Todo saveTodo(Todo todo) {
        todoRepository.save todo
        //return todoRepository.save(todo)
    }

    Todo updateTodo(Todo todo){
        todoRepository.save todo
        //return todoRepository.save(todo)
    }

    def deleteTodo(Integer todoId) {
        todoRepository.deleteById todoId
        //return todoRepository.deleteById(todoId)
    }

}
