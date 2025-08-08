package com.gqt.corejava.Encapsulation;
class Dog{
	private String name;
	private String color;
	private String country;
	private int age;
	private int cost;
	
	void setData(String name, String color, String country, int age, int cost) {
		name = name;
		color = color;
		country = country;  //shadowing problem compiler gets confused which it is instance and local 
		age = age;
		cost = cost;
	}
	void getData() {
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Country = "+country);
		System.out.println("Age = "+age);
		System.out.println("Cost = "+cost);
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setData("Bheem","Biscuit","India",5,5000);
		d.getData();

	}

}
