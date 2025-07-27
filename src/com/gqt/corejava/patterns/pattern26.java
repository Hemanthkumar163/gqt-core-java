package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j<n;j++) {
				if((i+j)%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
		sc.close();

	}

}
