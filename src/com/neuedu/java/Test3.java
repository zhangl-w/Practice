package com.neuedu.java;

import java.util.Arrays;

/**
 * 3、给定一个整数数组a，要求去掉数组中的负数，同时重复的正数只能保留一个
 * 将处理后的结果存入数组b中，并显示b的结果
 * 比如int[] a ={2,3,-1,3,2,-2,4},结果是{2,3,4}
 *
 *
 */

public class Test3 {

	public static void main(String[] args) {
		
	
	int[] a ={2,3,-1,3,2,-2,4};
	//1、排除所有的负数
	//建立一个数组存储所有的正数，需要知道数组中正数的个数
	int count=0;//计算正数的个数
	for(int i = 0;i<a.length;i++)
	{
		if(a[i]>=0)
		{
			count++;
		}
	}
	
	//用于存储所有的正数
	int[] m= new int[count];
	int idx = 0;
	for(int i = 0;i<a.length;i++)
	{
		if(a[i]>=0)
		{
			//存到m中
			m[idx]=a[i];
			idx++;
		}
	}

	//2、排除重复的数字
	Arrays.sort(m);
	int[] b = new int[m.length];
	b[0]=m[0];
	idx=1;
	for(int i = 1;i<m.length;i++)
	{
		if(m[i]!=m[i-1])
		{
			b[idx]=m[i];
			idx++;
		}
	}
	
	for(int i =0 ; i<idx;i++)
	{
		/*if(b[i]==0)
		{
			break;
		}*/
	
		System.out.println(b[i]);
	}
	
	
	
	
	}
	
}
