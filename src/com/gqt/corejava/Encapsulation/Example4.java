package com.gqt.corejava.Encapsulation;
class Dog2{
	private String name;
	private String color;
	private String country;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d2 = new Dog2();
		d2.setName("Chintu");
		d2.setColor("Green");
		d2.setCountry("India");
		d2.setAge(9);
		d2.setCost(5000);
		System.out.println("Name = "+d2.getName());
		System.out.println("Color = "+d2.getColor());
		System.out.println("Country = "+d2.getCountry());
		System.out.println("Age = "+d2.getAge());
		System.out.println("Cost = "+d2.getCost());
	}

}
