package com.gqt.corejava.Inheritance;
class Animal1{
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
class Lion extends Animal1{
	@Override
	void Eat() {
		System.out.println("Lion eats meat");
	}
	void hunt(){
		System.out.println("Lion hunt the jungle");
	}
}
class Bird extends Animal1{
	@Override
	void Eat(){
		System.out.println("Birds eat seeds and grains");
	}
	void fly(){
		System.out.println("Birds flies in the sky");
	}
}
class Fish extends Animal1{
	@Override
	void Eat() {
		System.out.println("Fish eat Algae");
	}
	void swim(){
		System.out.println("Fish swims in the Water");
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Bird b = new Bird();
		Fish f = new Fish();
		
		l.Breath();
		l.Eat();
		l.Sound();
		l.hunt();
		System.out.println("---------------");
		b.Breath();
		b.Eat();
		b.Sound();
		b.fly();
		System.out.println("-----------------");
		f.Breath();
		f.Eat();
		f.Sound();
		f.swim();
	}

}
