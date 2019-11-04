package com.neusoft.test;

public class Test18 {
	
		int f(int i){
			if(i<=1){
				return i; 
			}
			return i+f(i-1);
		
		}
		
		
		public static void main(String[] args) {
			Test18 t =new Test18();
			int k=t.f(10);
			System.out.println(k);
		}
}
