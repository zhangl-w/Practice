package com.neusoft.test;

import java.util.Scanner;

public class Test14 {
		int f(int i){
			if(i<=1){
				return 1; 
			}
			return i+f(i-1);
		}		
		public static void main(String[] args) {
			for(;;){
				System.out.println("请输入一个正整数");
				Scanner sc = new Scanner(System.in);
				int p=sc.nextInt();
				Test14 t= new Test14();
				int k=t.f(p);
				System.out.println("1+……+"+p+" 的值为:"+k);
			}
			
			
			
		}
}
