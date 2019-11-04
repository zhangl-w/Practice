package com.neusoft.test;

public class Test15 {
	static{
		System.out.println("静态代码块");
	}
	{
		System.out.println("普通代码块");
	}
	Test15(){
		System.out.println("构造代码块");
	}	
	String test(){
		System.out.println("普通方法");		
		return "普通方法";
	}
	public static void main(String[] args) {
		Test15 t= new Test15();
		t.test();
	}
}
