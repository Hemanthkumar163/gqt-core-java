/**
 * 
 */
package com.gqt.corejava.alphabetpatterns;

import java.util.Scanner;

/**
 * 
 * @author hemanth
 * @category patterns
 * @description This is an example for S alphabet pattern
 */
public class S_alphabet {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1  || i==n/2 || j==0 && i<n/2 && i!=0  || j==n-1 && i>n/2 && i!=n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
		

	}

}
