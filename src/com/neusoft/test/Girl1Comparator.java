package com.neusoft.test;

import java.util.Comparator;

public class Girl1Comparator implements Comparator<Girl1>{

	@Override
	public int compare(Girl1 o1, Girl1 o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
