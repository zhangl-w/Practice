package com.neusoft.test;

import java.util.Scanner;

public class Test10 {

	int f(int n){//递归 n=(n*1)*n
		if(n<=2){
			return n;
		}
		return f(n-1)*n;
	}
	public static void main(String[] args) {
		System.out.println("请输入一个正整数");
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();//输入的正整数	
		Test10 t = new Test10();//创建对象
		int k=t.f(p);//调用方法
		System.out.println(p+":的阶乘为:"+k);
		
	}
}
