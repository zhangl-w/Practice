package com.neusoft.test;

public class Test13 {
	public static void main(String[] args) {//ˮ�ɻ�
		//��100-1000�е���λ��(��λ������+ʮλ������+��λ������=��Χ֮�ڵ�����)
		int a,b,c;//�ֱ����:��λ��ʮλ����λ
		for(int i=100;i<1000;i++){
			a=i/10/10%10;//153/10/10%10=1  ��λ
			b=i/10%10;//153/10%10=5
			c=i%10;//153%10=3
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}		
		}		
	}
}
