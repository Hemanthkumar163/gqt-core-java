package com.gqt.corejava.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch4 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Division operation");
			System.out.println(".......................");
			System.out.println("Enter the first number ");
			int n1=sc.nextInt();//critical statement--input mismatchexception
			System.out.println("Enter the second number ");
			int n2=sc.nextInt();//critical statement-
			
			int res=n1/n2;//critical statement-ArthmeticException
			
			System.out.println(res);
			System.out.println("Array Operation");
			System.out.println("......................");
			System.out.println("Enter the size of array ");
			int size=sc.nextInt();//critical statement
			int arr[]=new int[size];//critical statement-
			System.out.println("Enter the value to be added ");
			int val=sc.nextInt();//critical statement--input mismatchexception
			System.out.println("enter the position");
			int pos=sc.nextInt();
			arr[pos]=val;
			System.out.println("value added");
			sc.close();
		   }
		
		//specific catch
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception was generated and handled ");
		}
		catch(InputMismatchException ime) {
			System.out.println("Input Mismatch Exception was generated and handled ");
		}
		catch(NegativeArraySizeException nae) {
			System.out.println("Negative Array Size Exception was generated and handled " );
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Index Out Of Bounds Exception was generated and handled " );
		}
		
		//Generic catch
		catch (Exception e) {
			System.out.println("Exception occur in catch block");
		}
	 }

}
