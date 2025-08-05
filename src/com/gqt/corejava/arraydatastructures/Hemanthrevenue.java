/**
 * 
 */
package com.gqt.corejava.arraydatastructures;

import java.util.Scanner;

/**
 * 
 */
class Movieoperations{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter language count: ");
		int lan = sc.nextInt();
		System.out.println("Enter category count in each language : ");
		int cat = sc.nextInt();
		System.out.println("Enter movie count in each category  : ");
		int mov = sc.nextInt();
		
		//creating 3d array
		arr = new long[lan][cat][mov];
		System.out.println("Array created ");
		System.out.println("-----------------");
		
		System.out.println("Enter the investment made: ");
		investment = sc.nextLong();
		System.out.println("Enter the profit made in financial year  2023-2024: ");
		prev_profit = sc.nextLong();
		System.out.println("--------------------------------------");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category count: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the revenue genarated by movie no: "+(k+1));
					arr[i][j][k] = sc.nextLong();
					sum_revenue += arr[i][j][k];
					
				}
			}
		}
	}
	void displaydata() { 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Language no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Category no: " +(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Revenue of the movie no: " +(k+1)+" is = "+arr[i][j][k]);
				}
			}
			System.out.println();
		}
	}

}
public class Hemanthrevenue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movieoperations mo = new Movieoperations();
		mo.createArray();
		mo.collectdata();
		mo.displaydata();

	}

}
