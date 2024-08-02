package com.ivoronline.springboot_accessories_beans_scope_request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  //PROPERTIES
  @Autowired Person person1; //New Instance/Bean
  @Autowired Person person2; //New Instance/Bean
  
  //=========================================================================================================
  // SET PERSON NAME
  //=========================================================================================================
  @RequestMapping("setPersonName")
  void setPerson() {
    person1.name = "John";
    person2.name = "Bill";
    person1.increaseCounter();
    person1.increaseCounter();
  }
  
  //=========================================================================================================
  // GET PERSON NAME
  //=========================================================================================================
  @RequestMapping("getPersonName")
  String getPerson() {
    person1.counter++;
    //return person1.increaseCounter() + ":" + person1.name + " - " + person2.name;
    return person1.counter + ":" + person1.name + " - " + person2.name;
  }

}
