package com.gqt.corejava.Stringprogramming;

import java.util.Scanner;

public class Stringsumandproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int sum=0;
		long product=1;
		for(int i=0;i<str.length();i++) {
			sum = sum + str.charAt(i);
			product = product*str.charAt(i);
		}
		System.out.println("Sum = "+sum);
		System.out.println("Product = "+product);
	}

}
