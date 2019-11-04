package com.neusoft;

public class Person {
	private int age;

	public Person() {
		super();
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws MyException{
		 if(age <= 0 || age > 120){
			 throw new MyException(age);
		 }else {
	        	this.age = age;
	        }
		
	}
	
}
