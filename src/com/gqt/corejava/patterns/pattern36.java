package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);  // Convert row number to alphabet
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print alphabet characters
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();

	}

}
