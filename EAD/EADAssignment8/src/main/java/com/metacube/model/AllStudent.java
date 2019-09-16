package com.metacube.model;

import java.util.ArrayList;

public class AllStudent {
	
	 public static  ArrayList<Student> list1 = new ArrayList<Student>();

		public static ArrayList<Student> getStudent(){
			
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1 = new Student("Jaya", "Kanwat", "RS Kanwat",
				"jaya.kanwat@metacube.com", "10", "15");
		Student s2 = new Student("Vijay", "Nayak", "Dinesh Nayak",
				"vijay.nayak@metacube.com", "11", "16");
		Student s3 = new Student("Bhanu", "Verma", "Keshav Verma",
				"bhanu.verma@metacube.com", "12", "17");
		Student s4 = new Student("Sunny", "Sharma", "SRK",
				"sunny.sharma@metacube.com", "8", "10");
		Student s5 = new Student("Raj", "Yadav", "Ranjeet Yadav",
				"raj.yadav@metacube.com", "5", "7");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		return list1;
		
		}

}
