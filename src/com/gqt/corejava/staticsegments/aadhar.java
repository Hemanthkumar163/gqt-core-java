package com.gqt.corejava.staticsegments;
import java.util.Scanner;
class Aadhar1{
	String name;
	long aadharno;
	String place;
	static String nationality;
	
	static {
		nationality = "india";
	}
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("aadharno :");
		aadharno = sc.nextLong();
		System.out.println("Enter place :");
		place = sc.next();
	}
	void display() {
		System.out.println(name);
		System.out.println(aadharno);
		System.out.println(place);
		System.out.println(nationality);
	}
}
public class aadhar {

	public static void main(String[] args) {
		Aadhar1 a1 = new Aadhar1();
		Aadhar1 a2 = new Aadhar1();
		Aadhar1 a3 = new Aadhar1();
		System.out.println("Aadhar-1");
		a1.collectData();
		a1.display();
		System.out.println("------------");
		System.out.println("Aadhar-2");
		a2.collectData();
		a2.display();
		System.out.println("------------");
		System.out.println("Aadhar-3");
		a3.collectData();
		a3.display();
		
		// TODO Auto-generated method stub

	}

}
