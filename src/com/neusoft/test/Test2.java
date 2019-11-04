package com.neusoft.test;

import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

import org.junit.Test;

public class Test2 {
/*	*//**
	 * 
	 *//*
	@Test
	public int str(){
	private	Random rr = new Random();
		int i=r.nextInt(10);
		System.out.println(i);
		return 10;
	}*/

	public static void main(String[] args) {
		Test3 t = Test3.tt();
		Test3 t1 = Test3.tt();
		//System.out.println(t==t1);
		Test4 t4 = Test4.t4();
		Test4 t5 = Test4.t4();
		System.out.println(t4==t5);
		
	}
}
class Test3{
	private static Test3 t3 = new Test3();//饿汉式类一被加载就创建对象
	private Test3(){
			
	}
	public static Test3 tt(){
		return t3;
	};
}
class Test4{
	private static Test4 t4;
	private Test4(){
		
	}
	public static Test4 t4(){//懒汉式后创建对象
		if(t4==null){
			synchronized (Test4.class) {
				if(t4==null){
					t4=new Test4();		
					}
			}			
		}
		return t4;
	}
}