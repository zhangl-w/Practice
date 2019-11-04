package com.neusoft.test;

public class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("===========");
	}
public static void main(String[] args) {
	Dog d = new Dog();	
	d.run();
	d.eat();
}
	

	
	
}
