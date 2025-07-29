package com.gqt.corejava.staticsegments;
import java.util.Scanner;

class Farmer1{
	double principle;
	static double rate;
	double time;
	double si;
	
	static {
		rate = 2.789;
	}
	
	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Principle: ");
		principle = sc.nextDouble();
		System.out.println("Enter the time: ");
		time = sc.nextDouble();
		rate = 2.789;
		
	}
	void calculate(){
		si = (principle * time * rate)/100;
	}
	void display() {
		System.out.println("SI = "+si);
	}
}
public class MainApp {

	public static void main(String[] args) {
		Farmer1 f1 = new Farmer1();
		Farmer1 f2 = new Farmer1();
		Farmer1 f3 = new Farmer1();
		System.out.println("Farmer-1");
		f1.collectdata();
		f1.calculate();
		f1.display();
		System.out.println(".........");
		System.out.println("Farmer-2");
		f2.collectdata();
		f2.calculate();
		f2.display();
		System.out.println(".........");
		System.out.println("Farmer-3");
		f3.collectdata();
		f3.calculate();
		f3.display();
		System.out.println(".........");
		// TODO Auto-generated method stub

	}

}
