package com.kit.statics;

import static java.lang.Math.random;
import static java.lang.Math.*;

public class StaticTest {

	public void foo() {
		System.out.println("foo metosunday�z");
		goo();
		double pi = Math.PI;
		int pi2 = (int) pi;
		System.out.println(pi2);
		
	}

	public static void goo() {
		System.out.println("goo metosunday�z");
	}

	public static void main(String[] args) {
//		goo();
//		StaticTest st = new StaticTest();
//		st.foo();
//		goo();
//		
//		StaticTest2.goo2();
		
		
		System.out.println("Main Metod i�erisindeyim...");
	}
	
	static {
		System.out.println("Static metod i�erisindeyim...");
	}

}
