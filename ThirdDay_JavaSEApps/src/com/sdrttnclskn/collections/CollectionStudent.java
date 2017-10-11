package com.sdrttnclskn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionStudent {

	public static void main(String[] args) {

		Student st1 = new Student("ali", "cal��", 23);
		Student st2 = new Student("hasan", "cal��", 25); 
		Student st3 = new Student("h�seyin", "cal��", 27);
		Student st4 = new Student("�mer", "cal��", 20);
		
		List<Student> students = new ArrayList<>();
		
	    students.add(st4);
	    students.add(st3);
	    students.add(st2);
	    students.add(st1);
	    
	    //isim g�re s�ralar.
	    Comparator<Student> sortname = new Student();
	    Collections.sort(students,sortname);
	    
	   // Collections.sort(students);  // ya�a g�re s�ralar
	    
	    for (Student student : students) {
			System.out.println(student);
		}


	}

}
