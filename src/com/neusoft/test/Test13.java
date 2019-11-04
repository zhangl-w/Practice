package com.neusoft.test;

public class Test13 {
	public static void main(String[] args) {//水仙花
		//求100-1000中的三位数(百位三次幂+十位三次幂+个位三次幂=范围之内的数字)
		int a,b,c;//分别代表:百位、十位、个位
		for(int i=100;i<1000;i++){
			a=i/10/10%10;//153/10/10%10=1  百位
			b=i/10%10;//153/10%10=5
			c=i%10;//153%10=3
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}		
		}		
	}
}
