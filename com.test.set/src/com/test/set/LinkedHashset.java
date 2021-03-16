package com.test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashset set= new LinkedHashset();
		Book b1=new Book(1,"Java","ABC");
		set.add(b1);
		for(Book sub:set) {
			System.out.println("ID:"+ sub.id+" "+"Name:"+ sub.name+" "+"Publisher:"+ sub.publisher+" ");
			
			}
		}
	}
	class Book{
		int id;
		String name,publisher;
		public Book(int id, String name, String publisher)
		{
			super();
			this.id=id;
			this.name=name;
			this.publisher=publisher;
		}
	}