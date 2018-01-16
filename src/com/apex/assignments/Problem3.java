package com.apex.assignments;

public class Problem3 {
	
	public static Boolean IsEvenNumber(String str){
		int num = Integer.parseInt(str);
		return num%2 == 0;
	}
	
	public static Boolean IsInteger(String str){
		try{
			 int num = Integer.parseInt(str);
			 return true;
		   } catch (NumberFormatException e) {
			 return false;
		   }
	}
	
	public static Boolean  IsOddNumber(String str){
		int num = Integer.parseInt(str);
		return num % 2 != 0;
	}	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(IsEvenNumber("5"));
		System.out.println(IsInteger("7.9"));
		System.out.println(IsOddNumber("4"));

	}
}
