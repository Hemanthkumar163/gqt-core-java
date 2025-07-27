package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");     
        int n = sc.nextInt();  // This will be the center row                                               
        // Top half (including middle row)
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int space=1;space<=n-i;space++) {
                System.out.print(" ");
            }
            // Increasing numbers
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            // Decreasing numbers
            for (int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Bottom half (excluding middle row)
        for (int i=n-1;i>=1;i--) {
            // Spaces
            for (int space=1;space<=n-i;space++) {
                System.out.print(" ");
            }
            // Increasing numbers
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            // Decreasing numbers
            for (int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();

	}

}
                               



