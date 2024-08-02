package com.ivoronline.springboot_accessories_beans_scope_request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  //PROPERTIES
  @Autowired Person person1; //Singleton Proxy around Singleton Bean
  @Autowired Person person2; //Singleton Proxy around Singleton Bean
  
  //=========================================================================================================
  // SET PROXY NAME
  //=========================================================================================================
  @RequestMapping("setProxyName")
  String setProxyName() {
    person1.name = "Proxy 1";    //Proxy Field
    person2.name = "Proxy 2";    //Proxy Field
    return person1.name + " - " + person2.name;
  }
  
  //=========================================================================================================
  // SET PERSON NAME
  //=========================================================================================================
  @RequestMapping("setPersonName")
  String setPersonName() {
    person1.setName("Bean 1");   //Bean Field
    person2.setName("Bean 2");   //Bean Field
    return person1.getName() + " - " + person2.getName();
  }
  
  //=========================================================================================================
  // SET PROXY COUNTER
  //=========================================================================================================
  @RequestMapping("setProxyCounter")
  String setProxyCounter() {
    person1.counter++;           //Proxy Field
    person2.counter++;           //Proxy Field
    return person1.counter + " - " + person2.counter;
  }
  
  //=========================================================================================================
  // SET BEAN COUNTER
  //=========================================================================================================
  @RequestMapping("setBeanCounter")
  String setBeanCounter() {
    person1.setCounter(person1.getCounter() + 1); //Bean Field
    person2.setCounter(person2.getCounter() + 1); //Bean Field
    return person1.getCounter() + " - " + person2.getCounter();
  }
  
}
