package com.neusoft.test;

public class StaticTest1 {
	public static void main(String[] args) {
		staticFunction();
		show();
	}
 
	static StaticTest1 st = new StaticTest1();
 
	static {
		System.out.println("1");
	}
 
	{
		System.out.println("2");
	}
 
	public StaticTest1() {
		System.out.println("3");
		System.out.println("构造函数中的.....a=" + a + " b=" + b);
 
	}
 
	public static void staticFunction() {
		System.out.println("4");
//		System.out.println("b=="+b);
	}
 
	int a = 110;
 
	static int b = 112;
 
	public static void show() {
		System.out.println("show..........b=" + b);
	}

}
