package com.neusoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test19 {
	
	public void test(){
		
	}
	public static void main(String[] args) {
		String[] s = {"Apple","Banana","Cat","Dog","Elephant","Float"};
		System.out.println(Arrays.toString(s));//数组转换成字符串形式
		/*
		 * 第一种颠倒顺序
		 * 冒泡排序方式
		 */
//		for(int i =0;i<s.length-1;i++){
//			for(int j=0;j<s.length-i-1;j++){
//				String k=s[j+1];
//				s[j+1]=s[j];
//				s[j]=k;				
//			}
//		}
//		System.out.println(Arrays.toString(s));
		
		/*
		 * 第二种方法
		 * 存进集合中循环遍历
		 */
//		List<String> list = new ArrayList<String>();
//		for(int i=s.length-1; i>=0;i--){
//			list.add(s[i]);
//		}
//		String[] k=list.toArray(s);
//		System.out.println(Arrays.toString(k));
		
		/*
		 *第三种方法 
		 *字符型
		 */
		//char[] c={'a','b','c','d','e','f'};
		//Character[] cc={'a','b','c','d','e','f'};
		/*
		 * Arrays.asList(s)
		 * 将指定的数组以集合的形式返回出来
		 * Collections.reverse();直接颠倒
		 * 方法里面放的是一个集合的形式 
		 */
//		Collections.reverse(Arrays.asList(s));
//		System.out.println(Arrays.toString(s));
		
	}
}
