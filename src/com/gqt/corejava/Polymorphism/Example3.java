package com.gqt.corejava.Polymorphism;

class Plane1{
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
class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Catgoplane flys at low heigths");
	}
	void carryGoods(){
		System.out.println("Cargoplane carry goods");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passengerplane flys at medium heigths");
	}
	void carryHumans(){
		System.out.println("Passengerplane carry Humans");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighterplane flys at medium heigths");
	}
	void carryweapons(){
		System.out.println("Fighterplane carry weapons");
	}
}
class Airport {
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		
		Airport ap = new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("---------------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-----------------");
		
		ap.permit(fp);
		fp.carryweapons();
	}

}