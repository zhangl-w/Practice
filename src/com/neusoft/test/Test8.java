package com.neusoft.test;

public class Test8 {
	public static void main(String[] args) {
		/**
		 * 
		 */
		int num=0;
		int h=100;
		for(;;){			
			h/=2;
			num++;			
			if(h<1){
				break;
			}
		}
		System.out.println(num);
	}
}
