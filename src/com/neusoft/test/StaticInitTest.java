package com.neusoft.test;

public class StaticInitTest {
static int value = getValue();
	
	static { // ͨ����̬��ʼ����Ϊname������ʼ��
		System.out.println("��̬�������value��ֵ=" + value);
		name = "�ܽ���";		
	}

	static {
		value = 10;		
		print("��̬�����");		
	}	
	
	static String name = "����ϼ"; // ���徲̬����
	
	public static void print(String s) {
		System.out.println("value��ֵ=" + value + " " + "������:" + name);
	}

	public static int getValue() {
		return ++value;
	}

	public static void main(String[] args) {

		System.out.println("value��ֵ��" + StaticInitTest.value);
		System.out.println("name��ֵ��" + StaticInitTest.name);		
	}
}
