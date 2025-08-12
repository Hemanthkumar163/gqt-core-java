package com.gqt.corejava.Inheritance;
class Plane{
	void takeOff() {
		System.out.println("Plane tookoff");
	}
	void fly() {
		System.out.println("Plane Flys");
	}
	void land() {
		System.out.println("Plane Lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Catgoplane flys at low heigths");
	}
	void carryGoods(){
		System.out.println("Cargoplane carry goods");
	}
}
class PassengerPlane extends Plane{
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
	void fly() {
		System.out.println("Fighterplane flys at medium heigths");
	}
	void carryweapons(){
		System.out.println("Fighterplane carry weapons");
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("---------------");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("-----------------");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryweapons();
	}

}
