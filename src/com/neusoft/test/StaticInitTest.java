package com.neusoft.test;

public class StaticInitTest {
static int value = getValue();
	
	static { // 通过静态初始化块为name变量初始化
		System.out.println("静态代码块中value的值=" + value);
		name = "周杰伦";		
	}

	static {
		value = 10;		
		print("静态代码块");		
	}	
	
	static String name = "林青霞"; // 定义静态变量
	
	public static void print(String s) {
		System.out.println("value的值=" + value + " " + "名字是:" + name);
	}

	public static int getValue() {
		return ++value;
	}

	public static void main(String[] args) {

		System.out.println("value的值：" + StaticInitTest.value);
		System.out.println("name的值：" + StaticInitTest.name);		
	}
}
