package com.neuedu.java;

import java.util.Scanner;

/**
 * 1������һ����������������m��n����
 * 
 *
 */
public class Test1 {

	public static int pow(int m,int n)
	{
		int r = 1;
		for (int i = 0;i<n;i++)
		{
			r = r*m;
		}
		return r;
	}
	
	
	

	public static void main(String[] args) {
		
		int n = pow(2,3);
		System.out.println(n);
		
	}
}
