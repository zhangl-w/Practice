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
		System.out.println(Arrays.toString(s));//����ת�����ַ�����ʽ
		/*
		 * ��һ�ֵߵ�˳��
		 * ð������ʽ
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
		 * �ڶ��ַ���
		 * ���������ѭ������
		 */
//		List<String> list = new ArrayList<String>();
//		for(int i=s.length-1; i>=0;i--){
//			list.add(s[i]);
//		}
//		String[] k=list.toArray(s);
//		System.out.println(Arrays.toString(k));
		
		/*
		 *�����ַ��� 
		 *�ַ���
		 */
		//char[] c={'a','b','c','d','e','f'};
		//Character[] cc={'a','b','c','d','e','f'};
		/*
		 * Arrays.asList(s)
		 * ��ָ���������Լ��ϵ���ʽ���س���
		 * Collections.reverse();ֱ�ӵߵ�
		 * ��������ŵ���һ�����ϵ���ʽ 
		 */
//		Collections.reverse(Arrays.asList(s));
//		System.out.println(Arrays.toString(s));
		
	}
}
