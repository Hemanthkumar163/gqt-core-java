/**
 * 
 */
package com.gqt.corejava.patternswith.conditions;

import java.util.Scanner;
/* 
 * - - - - - $
 * - - - - $ $ $
 * - - - $ $ $ $ $
 * - - $ $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $ $
 */

/* Logic for printing $
 * 1$ = row n0:1 ---> 2*1-1=1
 * 3$ = row n0:2 ---> 2*2-1=3
 * 5$ = row n0:3 ---> 2*3-1=5
 * 7$ = row n0:4 ---> 2*4-1=7
 * 9$ = row n0:5 ---> 2*5-1=9
 * i.e (2*i-1)
 */
/**
 * @author hemanth
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class newpattern3 {

	/**
	 *
	 * @param args
	 * @description This is an example for conditional pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}

 