package com.gqt.corejava.Stringprogramming;

import java.util.Scanner;

// find smaller and capital vowel count
public class VowelCounnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int Cvowel_count = 0;
		int Svowel_count = 0;
		//str = str.toUpperCase();
		//str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
				str.charAt(i)=='O' || str.charAt(i)=='U') {
					Cvowel_count++;
				}
			}
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
				str.charAt(i)=='o' || str.charAt(i)=='u') {
					Svowel_count++;
				}
			}
		}
		System.out.println("Capital Vowel count = "+Cvowel_count);
		System.out.println("Smaller Vowel count = "+Svowel_count);


	}

}
