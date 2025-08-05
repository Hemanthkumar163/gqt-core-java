/**
 * 
 */
package com.gqt.corejava.arraydatastructures;

import java.util.Scanner;

/**
 * @author hemanth
 * @category Arrays
 * @description This is an example for one dimensional array
 * 
 */
public class Arraycode1 {

	/**
	 * It is an example for unstructured program in dynamic way for 1 dimensional array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int n = sc.nextInt();
		
		//Creating the array to store n Students marks
		int arr[] = new int[n];
		
		//collecting & storing the storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no:" +(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("--------------------");
		
		// Display marks stored inside the array
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no:"+(i+1)+" is = "+arr[i]);
		}
	}

}
