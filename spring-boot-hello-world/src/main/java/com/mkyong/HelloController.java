package com.mkyong;


//created a class hellocontroller
public class HelloController {

	//created a method of string hello returns john
   private static String hello() {
        return "John";
    }
   private static int fetchInt(){
	   return 1;
   }
    public static void main1(String[] args) {
    	//new object is created
    	//HelloController h1=new HelloController();
    	//assigning a variable "name"to the method "hello"
    	String name =hello();
    	int a=fetchInt();
    	//printing the string 
    	System.out.println(name);
    	System.out.println(a);
    	
    	
}
}