package com.neusoft.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test5 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		Random r = new Random();
		for(int i=0;i<11;i++ ){
			list.add(r.nextInt(10));
			
		}
		Collections.sort(list);
		System.out.println(list);
		//int j=list.get(0);
	//list.subList(0,9).clear();
	//System.out.println(list);
//		Integer[] arr=(Integer[]) list.toArray();
//		int o= arr.length;
//		System.out.println(o);
		//System.out.println(i);
	}
}
