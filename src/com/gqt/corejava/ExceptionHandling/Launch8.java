package com.gqt.corejava.ExceptionHandling;

import java.util.Scanner;

class Operations4{
	void function1() throws Exception{
		System.out.println("Inside function-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division operation");
		System.out.println(".......................");
		System.out.println("Enter the first number ");
		int n1=sc.nextInt();//critical statement--input mismatchexception
		System.out.println("Enter the second number ");
		int n2=sc.nextInt();//critical statement-- input mismatchexception
		int res=n1/n2;//critical statement-ArthmeticException
		System.out.println(res);
		System.out.println("OutOff function-1");
	}
}
class Operations5{
	void function2() throws Exception {
		System.out.println("Inside function-2");
		Operations1 op1 = new Operations1();
		op1.function1();
		System.out.println("OutOff function-2");
	}
}
class Operations6{
	void function3() throws Exception{
		System.out.println("Inside function-3");
		Operations2 op2 = new Operations2();
		try {
			op2.function2();
		}
		catch (Exception e) {
			System.out.println("Exception handled in function-3");
			throw e;
		}
		System.out.println("OutOff function-3");
	}
}
public class Launch8 {
	public static void main(String args[]) {
		System.out.println("Inside main function");
		Operations3 op3 = new Operations3();
		try {
			op3.function3();
		} catch (Exception e) {
			System.out.println("Exception handled in main");
		}
		System.out.println("OutOff main function");
	}

}
