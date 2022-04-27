package com.org.incubyte.todo;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TodoServiceShould {

  @Mock TodoRepository todoRepository;

  @Test
  public void check_todo_repository_is_called() {
    TodoService todoService = new TodoService(todoRepository);
    Todo todo = new Todo();

    todoService.save(todo);

    verify(todoRepository).save(todo);
  }
}
