package com.gqt.corejava.ThreadProgramming;

import java.util.Scanner;

class Addition{
	void add() {
		System.out.println("Adiition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result" +res);
		System.out.println("Adiition Operation Completed");
	}
}
class Printing{
	void print() {
		System.out.println("Printing Operation Started");
		for(int i=1;i<=10;i++) {
			System.out.println("I am so happy");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Operation Completed");
	}
}
class Banking{
	void Bank() {
		System.out.println("Banking Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int accno = sc.nextInt();
		System.out.println("Enter pin number: ");
		int pin = sc.nextInt();
		System.out.println("Data collected");
		System.out.println("Banking Operation closed");
	}
}
public class ThreadCode3 {

	public static void main(String[] args) {
		Addition a = new Addition();
		Printing p = new Printing();
		Banking b = new Banking();
		
		a.add();
		p.print();
		b.Bank();

	}

}
