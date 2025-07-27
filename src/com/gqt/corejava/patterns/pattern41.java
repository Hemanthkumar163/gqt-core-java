package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            // Print leading spaces
            for (int s=1;s<=n-i;s++) {
                System.out.print("  ");
            }
            // Print increasing letters
            for (int j=1;j<=i;j++) {
                char ch=(char) ('A'+j-1);
                System.out.print(ch + " ");
            }
            // Print mirrored increasing letters (again from A to i-1)
            for (int j=1;j<=i-1;j++) {
                char ch=(char)('A'+j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();

	}

}
