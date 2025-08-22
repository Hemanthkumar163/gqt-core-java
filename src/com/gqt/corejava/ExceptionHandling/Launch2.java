package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;

//try with single catch block
public class Launch2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int n1 = sc.nextInt(); //critical Statement
			System.out.println("Enter the Second number: ");
			int n2 = sc.nextInt(); //critical Statement
			
			int res = n1/n2; //critical Statement
			
			System.out.println(res);
			}
		
		catch(Exception e){
			System.out.println("Exception ocuured and handled in catch block");
		}
		
	}

}
