package com.neusoft.test;

import java.util.Scanner;

class Person {
    private int age;
    public void setAge(int age){
        if(age <= 0 || age > 120){
            throw new RuntimeException("年龄范围不合法");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
   
}
public class PersonTest{
	 public static void main(String[] args) {
		Person person = new Person();
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		try {
			person.setAge(age);
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}