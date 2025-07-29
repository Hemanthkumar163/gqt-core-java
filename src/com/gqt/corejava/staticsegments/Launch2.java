package com.gqt.corejava.staticsegments;
class calculator{
	void add() {
		int a=10;
		int b=20;      //local variables
		int res=a+b;
	}
	void sub(int b, int c) {
		int res = b-c;
		System.out.println(res);
	}
}
public class Launch2 {

	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.add();
		c1.sub(30,10);
		// TODO Auto-generated method stub

	}

}
