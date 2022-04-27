package com.org.incubyte.todo;

import io.micronaut.http.annotation.Controller;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TodoControllerShould {

  @Mock TodoService todoService;

  @Test
  public void check_save_todo_service_is_called() {
    // Arrange

    TodoController todoController = new TodoController(todoService);
    Todo todo = new Todo();
    // Act

    todoController.save(todo);

    // Assert

    verify(todoService).save(todo);
  }
}
