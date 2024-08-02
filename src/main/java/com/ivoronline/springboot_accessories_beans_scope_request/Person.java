package com.ivoronline.springboot_accessories_beans_scope_request;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Person {

  //PROPERTIES
  public String name;
  public int    counter;
  
  int increaseCounter() {
    counter++;
    return counter;
  }
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  @PreDestroy
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
