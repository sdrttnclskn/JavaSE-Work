package com.sdrttnclskn.object;

public class TestObject {

	public static void main(String[] args) {
	
		Student student1 = new Student("ali", "hasan", 24);
		System.out.println(student1);
		
		Student student2 = new Student("ali", "hasan", 24);
		//equls metodunu kulland���m�zda object sorgular, ondan dolay� equls ve hash kodu kullanaarak jata kadld�r�yoruz.
		
		if (student1.equals(student2)) {
			System.out.println("bu iki ��renci e�it");
		}else {
			
			System.out.println("bu iki ��renci e�it de�il");
		}
		
	}

}
