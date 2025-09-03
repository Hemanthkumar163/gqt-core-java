package com.gqt.corejava.ThreadProgramming;

class Microsoft extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")){
			typing();
		}
		else if(Thread.currentThread().getName().equals("checking")){
			checking();
		}
		else {
			saving();
		}
	}
	
	public void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("typing in progress.......");
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}		
	}
	public void checking() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("checking in progress.......");
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}		
		
	}
	public void saving() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("saving in progress.......");
				Thread.sleep(2000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}	
		
	}
}
public class Thread5 {

	public static void main(String[] args) {
		Microsoft ms1 = new Microsoft();
		ms1.setName("typing");
		Microsoft ms2 = new Microsoft();
		ms2.setName("checking");
		Microsoft ms3 = new Microsoft();
		ms3.setName("saving");
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		ms1.start();
		ms2.start();
		ms3.start();
		
		
	}

}
