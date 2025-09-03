package com.gqt.corejava.ThreadProgramming;

import java.util.Scanner;

class Operation1 extends Thread{
	//@Override
	public void run() {
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
class Operation2 extends Thread{
	//@Override
	public void run() {
		System.out.println("Printing Operation Started");
		for(int i=1;i<=3;i++) {
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
class Operation3 extends Thread{
	//@Override
	public void run() {
		System.out.println("Banking Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accno = sc.nextInt();
		System.out.println("Enter pin number: ");
		int pin = sc.nextInt();
		System.out.println("Data collected");
		System.out.println("Banking Operation closed");
	}
}
public class ThreadCode4 {

	public static void main(String[] args) {
		Operation1 op1 = new Operation1();//thread object gets created
		Operation2 op2 = new Operation2();//thread object gets created
		Operation3 op3 = new Operation3();//thread object gets created
		op1.start();//op1 is handled over to Thread scheduler
		op2.start();//op2 is handled over to Thread scheduler
		op3.start();//op3 is handled over to Thread scheduler

	}

}
