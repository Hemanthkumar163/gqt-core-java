/**
 * 
 */
package com.gqt.corejava.arraydatastructures;

import java.util.Scanner;

/**
 * 
 */
class Arrayoperations4{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	
	void createarray() {
		System.out.println("Enter school count: ");
		int scl = sc.nextInt();
		arr = new String[scl][][];
		//collect class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter class count inside school no : "+(i+1));
			arr[i] = new String[sc.nextInt()][];
		}
		//collecting student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			arr[i] = new String[sc.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no : " +(j+1));
				arr[i][j] = new String[sc.nextInt()];
				
			}
		}
		System.out.println("Array is created: ");
		System.out.println("-----------------");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Student no: " +(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------");
	}
	void displaydata() { 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside schhol no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no: " +(k+1)+" is = "+arr[i][j][k]);
				}
			}
			System.out.println();
		}
	}
}
public class Arraymultidim2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoperations4 ao = new Arrayoperations4();
		ao.createarray();
		ao.collectdata();
		ao.displaydata();


	}

}
