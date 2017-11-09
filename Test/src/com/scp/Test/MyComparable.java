package com.scp.Test;

public class MyComparable implements Comparable<MyComparable> {

	int id;
	String name;
	int marks;
	@Override
	public int compareTo(MyComparable o) {
		
		return this.id-o.id;
	}
	
	
	
	public MyComparable(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nMyComparable [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
