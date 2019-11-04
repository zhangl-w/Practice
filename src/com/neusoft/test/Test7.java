package com.neusoft.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test7 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
	
		
		for(int j=0;;j++){
			int i=new Random().nextInt(20);
			if(!list.contains(i)){
				list.add(i);
				//System.out.println(list);	
			}	
			if(list.size()==10){
				Collections.sort(list);
				System.out.println(list);
				break;
			}
		}
		
		
	}
}
