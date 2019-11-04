package com.neusoft.test;

import java.util.Arrays;

public class Test20 {
	
	public static void main(String[] args) {
		int[] t= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(t));
		int i;
		for(i=t.length;i>0;i--){
			System.out.print("["+i+"]");		
			
		}
		int[] y=new int[i];
		System.out.println(Arrays.toString(y));
		for(int j=0;j<y.length;j++){
			System.out.print("["+j+"]");
		}
		
	}
}
