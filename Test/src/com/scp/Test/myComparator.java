package com.scp.Test;

import java.util.Comparator;

public class myComparator implements Comparator<Test1> {

	@Override
	public int compare(Test1 o1, Test1 o2) {

		return -(o1.eId - o2.eId);
	}

}


class myComparator1 implements Comparator<Test1> {

	@Override
	public int compare(Test1 o1, Test1 o2) {

		return o1.eName.compareTo(o2.eName);
	}

}