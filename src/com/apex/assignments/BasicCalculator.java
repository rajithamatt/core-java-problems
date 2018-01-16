package com.apex.assignments;
import java.io.IOException;
import java.util.Scanner;

public class BasicCalculator {
	public int add(int a, int b){
		return a + b;
	}
	public int sub(int a, int b){
		return a - b;
	}
	public int mul(int a, int b){
		return a * b;
	}
	public double div(int a, int b){
		return (1.0* a) / b;
	}
	
	public static void main(String[] args) throws IOException{
		BasicCalculator calc = new BasicCalculator();
		System.out.println(3 + " + " + 4 + " = " + calc.add(3, 4));
		System.out.println(3 + " - " + 4 + " = " + calc.sub(3, 4));
		System.out.println(3 + " * " + 4 + " = " + calc.mul(3, 4));
		System.out.println(3 + " / " + 4 + " = " + calc.div(3, 4));
 	//	System.out.println(add + ' ' + sub + ' '+ mul + ' ' + div + '.');
	}
}
