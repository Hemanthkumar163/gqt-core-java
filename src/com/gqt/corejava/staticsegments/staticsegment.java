package com.gqt.corejava.staticsegments;

class program1{
	int a,b,c;
	static int p,q,r;
	
	{
		a=100;
		b=200;          //Non static block
		c=300;
	}
	static {
		p=111;
		q=222;           //static block
		r=333;
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);        //Non static method
		System.out.println(c);

	}
	static void display2() {
		System.out.println(p);
		System.out.println(q);           //static method
		System.out.println(r);
	}
}
public class staticsegment {

	public static void main(String[] args) {
		program1.display2();
		program1.p=7000;
		program1.display2();
		program1 p1 = new program1();
		p1.display1();
		p1.display2();
		// TODO Auto-generated method stub

	}

}
