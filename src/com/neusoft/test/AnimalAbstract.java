package com.neusoft.test;

public abstract class AnimalAbstract {
	/*
	 * è�͹����Ƕ�����
	 * �м̳й�ϵ������ͬһ����ó�����
	 */
	public String animal;
	abstract String animalAbstract();
	
	String animal(){
		return "����һ��������";
	}
	public AnimalAbstract(String s){
		animal="����һ�����ද����"+s;
		System.out.println(animal);
	}

	public AnimalAbstract() {
		super();
	}
	
	
}
