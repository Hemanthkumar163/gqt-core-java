package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j<n;j++) {
				//j=1;j<=i;j++;
				System.out.print("*"+" ");
		
			}
			System.out.println();
		}
		
	}

}
