package com.neusoft.test;

public abstract class AnimalAbstract {
	/*
	 * 猫和狗都是动物类
	 * 有继承关系或者是同一类别用抽象类
	 */
	public String animal;
	abstract String animalAbstract();
	
	String animal(){
		return "这是一个动物类";
	}
	public AnimalAbstract(String s){
		animal="这是一个父类动物类"+s;
		System.out.println(animal);
	}

	public AnimalAbstract() {
		super();
	}
	
	
}
