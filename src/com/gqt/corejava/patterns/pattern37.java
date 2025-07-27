package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers from 1 to (2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        sc.close();

	}

}
