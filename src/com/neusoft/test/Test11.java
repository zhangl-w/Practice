package com.neusoft.test;

public class Test11 {
	static int Total(int total,int bottle,int cap ){
		cap%=3; bottle%=2;
		cap+=total; bottle+=total;
		if(total<=1&&bottle<=2&&cap<=3){
			return total;
		}else{
			return Total(cap/3+bottle/2,bottle,cap)+total;
		}
	}
	public static void main(String[] args) {
		int t=Total(3,0,0);
		System.out.println(t);
	}
	/*
	 * 3Ԫ =3ƿˮ
	 * 3ƿˮ 3����ƿ +3��ƿ��
	 * һƿˮ =1��ƿ��+1����ƿ
	 * 3+1+1
	 * 3��ƿ�ǻ�1ƿˮ
	 * 2����ƿ��1ƿˮ
	 */
}
