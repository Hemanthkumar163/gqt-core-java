/**
 * 
 */
package com.gqt.corejava.arraydatastructures;

import java.util.Scanner;

/**
 * 
 */
class Arrayoperations1{
	String arr[][];
	Scanner sc = new Scanner(System.in);
	
	void createarray() {
		System.out.println("Enter the class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the student count: ");
		int std = sc.nextInt();
		
		arr = new String[cls][std];
		System.out.println("Array is created: ");
		System.out.println("-----------------");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Student no: " +(j+1));
				System.out.println("enter student name: ");
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}
	void displaydata() { 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of student no: " +(j+1)+" is = "+arr[i][j]);
			}
		}
		System.out.println();
	}
}
public class Arraytwodim1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoperations1 ao = new Arrayoperations1();
		ao.createarray();
		ao.collectdata();
		ao.displaydata();

	}

}
