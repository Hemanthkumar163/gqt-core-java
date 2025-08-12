package com.gqt.corejava.Inheritance;
class Animal{
	public Animal() {
		super();
		System.out.println("Animal Zero parameterized constructor is invoked");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal parameterized constructor is invoked");
		System.out.println("The animal constructor has recieved the message as: "+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello from elephant");
		System.out.println("Hi from elephant constructor");
	}
	public Elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		System.out.println(name);
		System.out.println(weight);
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e = new Elephant();
		System.out.println("-------------------");
		Elephant e1 = new Elephant("Arjuna",5600);

	}

}
