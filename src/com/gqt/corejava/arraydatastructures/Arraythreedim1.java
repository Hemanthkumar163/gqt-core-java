/**
 *
 */
package com.gqt.corejava.arraydatastructures;

import java.util.Scanner;

/**
 *
 */
class Arrayoperations3{
	String arr[][][];
	Scanner sc = new Scanner(System.in);

	void createarray() {
		System.out.println("Enter school count: ");
		int scl = sc.nextInt();
		System.out.println("Enter class count in each school: ");
		int cls = sc.nextInt();
		System.out.println("Enter student count in each class: ");
		int std = sc.nextInt();
		//creating the 3d array
		arr = new String[scl][cls][std];
		System.out.println("Array is created: ");
		System.out.println("-----------------");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("class no: " +(j+1));
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
			System.out.println("Inside class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of student no: " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no: " +(k+1)+" is = "+arr[i][j][k]);
				}
			}
			System.out.println();
		}
	}
}
public class Arraythreedim1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoperations3 ao = new Arrayoperations3();
		ao.createarray();
		ao.collectdata();
		ao.displaydata();


	}

}
