package com.org.incubyte.response;

import liquibase.pro.packaged.T;

public class ResponseWrapper {
  T body;
  String message;

  public T getBody() {
    return body;
  }

  public void setBody(T body) {
    this.body = body;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
