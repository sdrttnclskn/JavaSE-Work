package com.sdrttnclskn.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("dosya a�lmak �zere");
			InputStream in = new FileInputStream("kaydet.txt");
			System.out.println("dosya a��ld�");
		} catch (FileNotFoundException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("filenotfount hatas� f�rlat�ld�.");
			e.printStackTrace();
		}finally {
			//db conn kapat�l�r....
		}
	}
	

}
