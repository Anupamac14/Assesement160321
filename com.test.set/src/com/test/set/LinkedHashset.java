package com.test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashset set= new LinkedHashset();
		Employee b1=new Employee(1,"ABC","Salem");
		set.add(b1);
		
		for(Employee sub : set) {
			System.out.println("ID:"+ sub.id+" "+"Name:"+ sub.name+" "+"Place:"+ sub.place+" ");
			
			}
		}
	}
	class Employee{
		int id;
		String name,place;
		public Employee(int id, String name, String place)
		{
			super();
			this.id=id;
			this.name=name;
			this.place=place;
		}
	}