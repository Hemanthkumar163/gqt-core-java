package com.gqt.corejava.Encapsulation;
class Dog1{
	private String name;
	private String color;
	private String country;
	private int age;
	private int cost;
	
	void setData(String name, String color, String country, int age, int cost) {
		this.name = name;
		this.color = color;
		this.country = country;  //by overcome the shadow problem we use this keyword
		this.age = age;
		this.cost = cost;
	}
	void getData() {
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Country = "+country);
		System.out.println("Age = "+age);
		System.out.println("Cost = "+cost);
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1 = new Dog1();
		d1.setData("Bantu","Biscuit","India",5,5000);
		d1.getData();

	}

}
