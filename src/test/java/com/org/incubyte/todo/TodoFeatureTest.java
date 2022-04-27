package com.org.incubyte.todo;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class TodoFeatureTest {
  @Inject
  @Client("/")
  HttpClient httpClient;

  @Test
  public void return_saved_todo() {
    Todo todo = new Todo();
    todo.setDescription("Testing data");
    Todo savedObject =
        httpClient.toBlocking().retrieve(HttpRequest.POST("todos/", todo), Argument.of(Todo.class));
    Assertions.assertThat(savedObject.getDescription()).isEqualTo("Testing data");

  }
}
