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
	 * 3元 =3瓶水
	 * 3瓶水 3个空瓶 +3个瓶盖
	 * 一瓶水 =1个瓶盖+1个空瓶
	 * 3+1+1
	 * 3个瓶盖换1瓶水
	 * 2个空瓶换1瓶水
	 */
}
