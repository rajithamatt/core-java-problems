package com.apex.assignments;

//Define an array with 10 integers and print all the elements with its index number.

public class PrintArrayElements {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length;i++) {
		   System.out.println( "arr[" + i + "] = " + arr[i]);
		}
	}
}
