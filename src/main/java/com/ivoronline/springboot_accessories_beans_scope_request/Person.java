package com.ivoronline.springboot_accessories_beans_scope_request;

import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data //Setters & Getters
@Component
@RequestScope
public class Person {

  //PROPERTIES
  public String name;
  public int    counter;

  //CONSTRUCTOR
  Person() {
    System.out.println("Person Constructed");
  }
  
  //DESTROY
  @PreDestroy
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
