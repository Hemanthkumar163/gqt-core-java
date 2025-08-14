package com.gqt.corejava.Polymorphism;

class Animal{
	void Breath() {
		System.out.println("Animal can Breath");
	}
	void Eat() {
		System.out.println("Animal can Eat");
	}
	void Sound() {
		System.out.println("Animal makes sound");
	}
}
class Lion extends Animal{
	@Override
	void Eat() {
		System.out.println("Lion eats meat");
	}
	void hunt(){
		System.out.println("Lion hunt the jungle");
	}
}
class Bird extends Animal{
	@Override
	void Eat(){
		System.out.println("Birds eat seeds and grains");
	}
	void fly(){
		System.out.println("Birds flies in the sky");
	}
}
class Fish extends Animal{
	@Override
	void Eat() {
		System.out.println("Fish eat Algae");
	}
	void swim(){
		System.out.println("Fish swims in the Water");
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Bird b = new Bird();
		Fish f = new Fish();
		
		Animal ref;
		
		ref = l;
		ref.Breath();
		ref.Eat();
		ref.Sound();
		l.hunt();
		System.out.println("---------------");
		
		ref = b;
		ref.Breath();
		ref.Eat();
		ref.Sound();
		b.fly();
		System.out.println("-----------------");
		
		ref = f;
		ref.Breath();
		ref.Eat();
		ref.Sound();
		f.swim();
	}

}
