package com.gqt.corejava.ThreadProgramming;

class Warrior extends Thread{
	String res1 = "AK-47";
	String res2 = "9mm";
	String res3 = "SMG";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("karthi")) {
			karthiacq();
		}
		else {
			maheshacq();
		}
	}
	
	private void karthiacq() {
		try {
			synchronized(res1) {
				System.out.println("Karthi has acquired : " +res1);
				Thread.sleep(4000);
				synchronized(res2) {
					System.out.println("Karthi has acquired : " +res2);
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println("Karthi has acquired : " +res3);
						Thread.sleep(2000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void maheshacq() {
		try {
			synchronized(res1) {
				System.out.println("mahesh has acquired : " +res1);
				Thread.sleep(4000);
				synchronized(res2) {
					System.out.println("mahesh has acquired : " +res2);
					Thread.sleep(3000);
					synchronized(res3) {
						System.out.println("mahesh has acquired : " +res3);
						Thread.sleep(2000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread9 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.setName("karthi");
		Warrior w2 = new Warrior();
		w2.setName("mahesh");
		
		
		w1.start();
		w2.start();

	}

}
