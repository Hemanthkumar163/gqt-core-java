package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;
public class Launch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt(); //critical Statement
		System.out.println("Enter the Second number: ");
		int n2 = sc.nextInt(); //critical Statement
		
		int res = n1/n2;
		
		System.out.println(res);

		
	}

}
