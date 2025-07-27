package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		char current = 'A';
		for(int i=1;i<=n;i++) {
			int count=2*i-1;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Store the starting character for this row
			char ch=(char)(current+count-1);
			for(int j=1;j<=count;j++) {
				System.out.print(ch);
				ch--;
				
			}
			System.out.println();
		}
		sc.close();
	}

}
