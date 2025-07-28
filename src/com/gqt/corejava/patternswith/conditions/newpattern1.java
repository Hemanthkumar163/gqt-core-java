
package com.gqt.corejava.patternswith.conditions;

import java.util.Scanner;

/**
 * # # # # # 
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # # 
 */
/*
 * @param args
 * @category patterns
 * @description This is an example for conditional pattern
 */
public class newpattern1 {

	/**
	 * @author hemanth
	 * @param args
	 * @description This is an example for conditional pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
		sc.close();

	}

}
