package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count ++;
				
			}
			System.out.println();
		}
		sc.close();
	}

}
