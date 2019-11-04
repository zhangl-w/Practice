package com.neusoft.test;

public class ExceptionTest {
	public static void m() throws Exception{
		try{
			throw new Exception();
		}finally{
			System.out.println("1");
		}
	}
    public static void main(String[] args) {
		try{
			m();
		}catch(Exception e){
			System.out.println("2");
		}
		System.out.println("3");
	}


}
