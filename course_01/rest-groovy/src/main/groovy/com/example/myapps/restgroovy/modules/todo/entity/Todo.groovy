package com.example.myapps.restgroovy.modules.todo.entity

import javax.persistence.*

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @Column
    String task

    @Column
    Boolean isCompleted
}
