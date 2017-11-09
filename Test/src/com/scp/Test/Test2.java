package com.scp.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		
		// Comparable 
		
		List<MyComparable> t1 = new ArrayList<MyComparable>();
		
		t1.add(new MyComparable(2, "Akshay", 100));
		t1.add(new MyComparable(3, "Mahesh", 100));
		t1.add(new MyComparable(1, "Guru", 40));
		
		System.out.println("Before sorting\n");
		System.out.println(t1);
		
		
		Collections.sort(t1);
		
		System.out.println("\nAfter ascending sorting on the basis of id\n");
		System.out.println(t1);
		
		
		
		
		
		System.out.println("\n\n\n\n Sorting using Comparator:\n");
		
		List<Test1> t = new ArrayList<Test1>();
		
		Test1 e1 = new Test1(5, "Akshay", 1000000);
		t.add(e1);
		t.add(new Test1(2, "Mahesh", 100000));
		t.add(new Test1(6, "Saurabh", 65460));
		
		System.out.println("Before sorting\n");
		System.out.println(t);
		
		
		Collections.sort(t, new myComparator());
		System.out.println("\n1. Descending sorting on the basis of id:");
		System.out.println(t);
		
		Collections.sort(t, new myComparator1());
		System.out.println("\n2. Ascending sorting on the basis of name:");
		System.out.println(t);
	}

}
