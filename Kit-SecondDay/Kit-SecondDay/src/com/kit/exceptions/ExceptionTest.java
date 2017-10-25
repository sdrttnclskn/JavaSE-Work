package com.kit.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ExceptionTest {

	
	public static void main(String[] args) throws IOException {
		foo();

		try (InputStream in = new FileInputStream("kayipdosya.txt")){
			System.out.println("Dosya a��lmak �zere...");
			List<String> abc;
			System.out.println("Dosya a��ld�...");
		} catch (FileNotFoundException | NullPointerException e) {
			System.out.println("FileNotFoundException hatas� f�rlat�ld�.");
			e.printStackTrace();
		} 
		

	}
	
	public static void foo() {
		int x = 2/0;
		System.out.println(x);
	}
	
	
}
