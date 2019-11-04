package com.neusoft.test;

import java.util.Random;

public class Test {
	public static void main(String[] args) {//
		
		/*	随机生成100个数字,并由小到大进行排序!!!	
		 * 
		 */
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++){
			int p = new Random().nextInt(100);
			arr[i]=p;
			System.out.println(p);
		}
		System.out.println("----------------------------------");
		
//		//int[] arr=new int[]{10,55,66,78,45,31,57,13,49,76,13,15,19,22,33,46,88,99,100};
		
		int t=0;
		for(int i=0;i<arr.length-1;i++){//比较几次
			for(int j=0;j<arr.length-i-1;j++){//-1防止数组越界
				if(arr[j]>arr[j+1]){
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int p:arr){
			System.out.println(p);
			System.out.println("长度为:"+arr.length);
		}
		
	}

}
