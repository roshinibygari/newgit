package com.mkyong;

import java.util.List;

//created a class hellocontroller
public class HelloController {

	//created a method of string hello returns john
   private static String hello() {
        return "John";
    }
   private static String hello1() {
       return "James";
   }
   private static List<String> returnListOfStrings() {
	   return null ;
	   
   }

   
    public static void main(String[] args) {
    	
    	List<String> myList=new List<String>();
    	
    	
    	//new object is created
    	//HelloController h1=new HelloController();
    	//assigning a variable "name"to the method "hello"
    	String name =hello();
    	HelloController h1=new HelloController();
    	HelloController h2=new HelloController();
    	//assigning a variable "name"to the method "hello"
    	String name1 =hello();
    	String name2=h2.hello1();
    	System.out.println(name);
    	System.out.println(name2);
    	//printing the string 
    	
    	System.out.println(myList);	
    	
    	
}
}