package com.apex.assignments;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		if(limit == 0) {
			System.out.println(0);
		} else if(limit == 1) {
			System.out.println("0,1");
		} else {
			System.out.print("0, 1");
			for(int i=2;i<=limit;i++){
				  n3 = n1+n2;
				  System.out.print(", " + n3);
				  n1 = n2;
				  n2 = n3;
			    }
		}		
	}
}
