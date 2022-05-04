package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//created a class hellocontroller
public class HelloController {

	//created a method of string hello returns john
   public String hello() {
        return "John";
    }
    public static void main(String[] args) {
    	//new object is created
    	HelloController h1=new HelloController();
    	//assigning a variable "name"to the method "hello"
    	String name = h1.hello();
    	//printing the string 
    	System.out.println(name);
    	
}
}