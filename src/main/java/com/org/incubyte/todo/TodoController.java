package com.org.incubyte.todo;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/todos")
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @Post
  public Todo save(@Body Todo todo) {
    return todoService.save(todo);
  }
}
