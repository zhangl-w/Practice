package com.neuedu.java;

import java.util.Arrays;

/**
 * 3������һ����������a��Ҫ��ȥ�������еĸ�����ͬʱ�ظ�������ֻ�ܱ���һ��
 * �������Ľ����������b�У�����ʾb�Ľ��
 * ����int[] a ={2,3,-1,3,2,-2,4},�����{2,3,4}
 *
 *
 */

public class Test3 {

	public static void main(String[] args) {
		
	
	int[] a ={2,3,-1,3,2,-2,4};
	//1���ų����еĸ���
	//����һ������洢���е���������Ҫ֪�������������ĸ���
	int count=0;//���������ĸ���
	for(int i = 0;i<a.length;i++)
	{
		if(a[i]>=0)
		{
			count++;
		}
	}
	
	//���ڴ洢���е�����
	int[] m= new int[count];
	int idx = 0;
	for(int i = 0;i<a.length;i++)
	{
		if(a[i]>=0)
		{
			//�浽m��
			m[idx]=a[i];
			idx++;
		}
	}

	//2���ų��ظ�������
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
