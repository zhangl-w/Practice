package com.neusoft.test;

import java.util.Random;

public class Test {
	public static void main(String[] args) {//
		
		/*	�������100������,����С�����������!!!	
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
		for(int i=0;i<arr.length-1;i++){//�Ƚϼ���
			for(int j=0;j<arr.length-i-1;j++){//-1��ֹ����Խ��
				if(arr[j]>arr[j+1]){
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int p:arr){
			System.out.println(p);
			System.out.println("����Ϊ:"+arr.length);
		}
		
	}

}
