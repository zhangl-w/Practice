package com.neusoft.test;

import java.util.Scanner;

public class Test10 {

	int f(int n){//�ݹ� n=(n*1)*n
		if(n<=2){
			return n;
		}
		return f(n-1)*n;
	}
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();//�����������	
		Test10 t = new Test10();//��������
		int k=t.f(p);//���÷���
		System.out.println(p+":�Ľ׳�Ϊ:"+k);
		
	}
}
