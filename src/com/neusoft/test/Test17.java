package com.neusoft.test;

public class Test17 {
	int i=2;
	public int ii(){		
		if(i==2){	
			System.out.println("这是2");
			return 0;
		}
		System.out.println("这我也不知道是什么");
		return 1;
	}
	public static void main(String[] args) {
		Test17 t = new Test17();
		t.ii();
	}
}
