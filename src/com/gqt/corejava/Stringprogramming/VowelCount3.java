package com.gqt.corejava.Stringprogramming;

import java.util.Scanner;

//Replace all vowels with the special character
public class VowelCount3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		//String res = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
				str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
				str.charAt(i)=='o' || str.charAt(i)=='u') {
					//res = res + str.charAt(i);
					str = str.replace(str.charAt(i),'$');
					
				}
			}
		}
		System.out.println(str);
		//sc.close();
		
	}

}
