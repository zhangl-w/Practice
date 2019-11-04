package com.neusoft.test;

public class RecursionTest {
	public static int f(int n) {
		if(n<=1) {
			return 1;
		}
		if(n==2) {
			return 3;
		}
		return f(n-1)+n;
	}
	public static void main(String[] args) {
		System.out.println(f(5));
	}
}
