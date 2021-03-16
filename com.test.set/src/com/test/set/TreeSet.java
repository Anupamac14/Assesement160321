package com.test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TreeSet {
public static void main(String[] args) {
		java.util.TreeSet <String> ts = new TreeSet<String>();
	
		ts.add("Anupama");
		ts.add("Rachana");
		Iterator<String> itr =ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String sub:ts) {
			System.out.println(ts);
		}
	}
}
