package com.mkyong;


//created a class hellocontroller
public class HelloController {

	//created a method of string hello returns john
   private static String hello() {
        return "John";
    }
   private static String hello1() {
       return "James";
   }
   private static void returnListOfStrings() {

	   
   }
  
    public static void main(String[] args) {
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
    	
    	
    	
    	
}
}