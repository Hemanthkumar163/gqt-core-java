package com.gqt.corejava.ThreadProgramming;

class Human1 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the restroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has exited the restroom");
			Thread.sleep(5000);		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread8{

	public static void main(String[] args) throws InterruptedException {
		Human1 h1 = new Human1();
		h1.setName("man");
		Human1 h2 = new Human1();
		h2.setName("women");
		Human1 h3 = new Human1();
		h3.setName("Others");
		
		/*//join method without time limit
		h1.start();
		h1.join();
		h2.start();
		h2.join();
		h3.start(); */
		
		//join method with time liimt
		h1.start();
		h1.join(3000);
		h2.start();
		h2.join(5000);
		h3.start(); 
	}

}
