package com.neusoft.test;

import java.util.Scanner;

public class Test21{
	private int age;

	public void setAge(int age) throws Exception{
		if(age<0||age>150){
			throw new RuntimeException("�������˲���ȷ������,������������");
			//System.out.println("�������˲���ȷ������,������������");
		}else{
			this.age = age;
		}
		
	}
	
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		for(;;){
			System.out.println("��������������");
			Scanner sc= new Scanner(System.in);
			int k=sc.nextInt();
			Test21 t = new Test21();
			try {
				t.setAge(k);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
	
	
	
}
