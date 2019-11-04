package com.neusoft.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object,String> map  = new HashMap<Object,String>();
		map.put("p1", "123");
		map.put("p2", "456");
		map.put("p3", "789");
		map.put("p4", "591");
		map.put("p5", "165");
		Set s=map.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			System.out.println(map.get(i.next()));
		}
		for(Object o:map.values()){
			System.out.println(o);
		}
	}

}
