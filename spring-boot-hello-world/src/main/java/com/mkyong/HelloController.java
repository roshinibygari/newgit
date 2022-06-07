package com.mkyong;

import java.util.ArrayList;
import java.util.List;

//created a class hellocontroller
public class HelloController {

	//created a method of string hello returns john
   private static String hello() {
        return "John";
    }
   private static String hello1() {
       return "James     ";
   }
   private static List<String> returnListOfStrings() {
	   return null ;
	   
   }
   private static List<String> addListOfStrings() {
	   List<String> emptyList=new ArrayList<String>();
	  emptyList.add("hello1");
	  emptyList.add("hello2");
	  emptyList.add("hello3");
	   return emptyList;
	   
   }

   
    public static void main(String[] args) {
    	HelloController h1=new HelloController();
		h1.addListOfStrings();
		System.out.println(h1.addListOfStrings());
    	
}
}