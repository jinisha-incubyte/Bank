package com.org.incubyte.todo;

import jakarta.inject.Singleton;

@Singleton
public class TodoService {

  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public Todo save(Todo todo) {
    return todoRepository.save(todo);
  }
}
