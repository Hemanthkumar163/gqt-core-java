package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.println();
		}

	}

}
