package com.apex.assignments;

//write a program to reverse the string 
//Input : “this is a main program” , output : should be “siht si a niam margorp”.

public class ReverseAString {
	public static void main(String args[]) {
		String name = "this is a main program";
		for(String word : name.split(" ")) {
			System.out.print(new StringBuilder(word).reverse().toString() + " ");
		}
	}	
}


