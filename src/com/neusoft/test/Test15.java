package com.neusoft.test;

public class Test15 {
	static{
		System.out.println("��̬�����");
	}
	{
		System.out.println("��ͨ�����");
	}
	Test15(){
		System.out.println("��������");
	}	
	String test(){
		System.out.println("��ͨ����");		
		return "��ͨ����";
	}
	public static void main(String[] args) {
		Test15 t= new Test15();
		t.test();
	}
}
