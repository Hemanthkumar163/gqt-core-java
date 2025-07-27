package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j=1;j<=n-i;j++) {
	                System.out.print(" ");
	            }
	            // Print increasing numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }
	            // Print decreasing numbers
	            for (int k= i - 1; k >= 1; k--) {
	                System.out.print(k);
	            }
	            // Move to next line
	            System.out.println();
	        }
	        sc.close(); 
		

	}

}
