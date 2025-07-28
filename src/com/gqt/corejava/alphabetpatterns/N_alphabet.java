/**
 * 
 */
package com.gqt.corejava.alphabetpatterns;

import java.util.Scanner;

/**
 * 
 * @author hemanth
 * @category patterns
 * @description This is an example for N alphabet pattern
 */
public class N_alphabet {

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
				if(j==0|| i==j || j==n-1) {
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
