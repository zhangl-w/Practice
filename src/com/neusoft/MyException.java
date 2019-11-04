package com.neusoft;

public class MyException extends Exception {
	private String meg;
	public MyException(int age) {
		// TODO Auto-generated constructor stub
		meg= "年龄不合法";
	}
	@Override
	public String toString() {
		return meg ;
	}
	
}
