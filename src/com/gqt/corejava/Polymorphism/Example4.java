package com.gqt.corejava.Polymorphism;

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
class Lion1 extends Animal1{
	@Override
	void Eat() {
		System.out.println("Lion eats meat");
	}
	void hunt(){
		System.out.println("Lion hunt the jungle");
	}
}
class Bird1 extends Animal1{
	@Override
	void Eat(){
		System.out.println("Birds eat seeds and grains");
	}
	void fly(){
		System.out.println("Birds flies in the sky");
	}
}
class Fish1 extends Animal1{
	@Override
	void Eat() {
		System.out.println("Fish eat Algae");
	}
	void swim(){
		System.out.println("Fish swims in the Water");
	}
}
class Jungle{
	void permit(Animal1 ref) {
		ref.Breath();
		ref.Eat();
		ref.Sound();
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion1 l = new Lion1();
		Bird1 b = new Bird1();
		Fish1 f = new Fish1();
		
		Jungle j = new Jungle();
		
		j.permit(l);
		l.hunt();
		System.out.println("---------------");
		
		j.permit(b);
		b.fly();
		System.out.println("-----------------");
		
		j.permit(f);
		f.swim();
	}

}