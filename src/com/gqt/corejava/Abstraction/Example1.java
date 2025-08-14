package com.gqt.corejava.Abstraction;

abstract class Test{
	void land() {
		System.out.println("Plane Lands");
	}
}
abstract class Plane{
	abstract void takeOff();	
	abstract void fly();
	void land() {
		System.out.println("Plane Lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Cargo Plane require a long runway to take off");
	}
	@Override
	void fly() {
		System.out.println("Cargoplane flys at low heigths");
	}
	void carryGoods(){
		System.out.println("Cargoplane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Passenger Plane  require a medium length runway to take off");
	}
	@Override
	void fly() {
		System.out.println("Passengerplane flys at medium heigths");
	}
	void carryHumans(){
		System.out.println("Passengerplane carry Humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Fighter Plane require a short runway to take off");
}
	@Override
	void fly() {
		System.out.println("Fighterplane flys at medium heigths");
	}
	void carryweapons(){
		System.out.println("Fighterplane carry weapons");
	}
}
class Airport {
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport ap = new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("---------------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-----------------");
		
		ap.permit(fp);
		fp.carryweapons();
		System.out.println("-----------------");
		
		//Plane p = new Plane();
		Plane p = new Plane() {

			@Override
			void takeOff() {
				System.out.println("takeOff");
				
			}

			@Override
			void fly() {
				System.out.println("Fly");
				
			}
		};
		p.takeOff();
		p.fly();
		p.land();
		
		Test t = new Test() {};
		
	}

}