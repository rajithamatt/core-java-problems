package com.apex.assignments;

// Write a program by using all string methods.
// charAt(), concat(), endsWith(), indexOf(), .length, 
// toUpperCase(), toLowerCase()

public class StringOperations {
	public static void main(String args[]){  
		String name1="Rajitha Matadha";
		String name2="Hello";
		char ch=name1.charAt(2);//returns the char value at the 4th index  
		System.out.println("The character at the 2nd index is " + name1.charAt(2));  
		System.out.println("The result of using concat method is :"+ name1.concat(name2));
		System.out.println("The result of using endsWith() " + name1.endsWith("t"));
		System.out.println("The total length of name1 is :" + name1.length());
		System.out.println("Converting to uppercase : " + name1.toUpperCase());
		System.out.println("Converting to lowercase : " + name1.toLowerCase());
	}
}	
