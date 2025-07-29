package com.gqt.corejava.staticsegments;
class Dog1{
	String name;
	String color;    //instance variables
	String breed;
	int cost;
	
	void allocateData() {
		name = "rocky";
		color = "brown";  //local variables
		breed = "gs";
		cost = 5000;	
	}
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
	}
}
public class Launch1 {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.name = "sammy";
		System.out.println(d1.name);
		d1.allocateData();
		d1.display();
	}
		// TODO Auto-generated method stub

	}


