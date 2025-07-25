package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
