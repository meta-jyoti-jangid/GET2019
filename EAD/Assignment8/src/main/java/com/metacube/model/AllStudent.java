package com.metacube.model;

import java.util.ArrayList;

public class AllStudent {
	
	 public static  ArrayList<Student> list1 = new ArrayList<Student>();

		public static ArrayList<Student> getStudent(){
			
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1 = new Student("Jaya", "kanwat", "RS kanwat",
				"jaya.kanwat@metacube.com", "10", "15");
		Student s2 = new Student("vijay", "Nayak", "Ram Nayak",
				"vijay.Nayak@metacube.com", "9", "14");
		Student s3 = new Student("Nikita", "Verma", "SK Verma",
				"nikita.Verma@metacube.com", "11", "16");
		Student s4 = new Student("Sapana", "Sharma", "Shyam Sharma",
				"sapana.Sharma@metacube.com", "8", "12");
		Student s5 = new Student("Dimple", "Garg", "JP Garg",
				"dimple.Garg@metacube.com", "5", "9");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		return list1;
		
		}

}
