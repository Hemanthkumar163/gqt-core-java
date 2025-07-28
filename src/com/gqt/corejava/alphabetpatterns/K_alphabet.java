/**
 * 
 */
package com.gqt.corejava.alphabetpatterns;

import java.util.Scanner;

/**
 * 
 * @author hemanth
 * @category patterns
 * @description This is an example for K alphabet pattern
 */
public class K_alphabet {

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
				if(j==0|| i+j==n/2 || i-j==n/2) {
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
