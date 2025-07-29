package com.gqt.corejava.staticsegments;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	
	void run() {
		System.out.println("Dog runs..");
	}
	void eat() {
		System.out.println("Dog eats..");
	}
}

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		System.out.println("name:"+ d1.name);
		System.out.println("color:" + d1.color);
		System.out.println("breed:" + d1.breed);
		System.out.println("cost:" + d1.cost);
		
		d1.name="jimmy";
		d1.color="brown";
		d1.breed="gs";
		d1.cost=7000;
		System.out.println("name:"+ d1.name);
		System.out.println("color:" + d1.color);
		System.out.println("breed:" + d1.breed);
		System.out.println("cost:" + d1.cost);
		System.out.println("........");
		d1.run();
		d1.eat();
		

	}

}
