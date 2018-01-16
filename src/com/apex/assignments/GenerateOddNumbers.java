package com.apex.assignments;

//Generate odd numbers up to 1000
public class GenerateOddNumbers {
	public static void main(String[] args){
		int limit = 100;
		System.out.println("Odd numbers from 1 to " + limit);
		for(int i=1;i<=limit;i++){
			if(i%2 != 0) {
			   System.out.println(i);
		     }
	    }  
	}
}
