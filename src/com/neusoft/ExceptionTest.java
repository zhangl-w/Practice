package com.neusoft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExceptionTest {
	public static void main(String[] args) {
		//常见的RuntimeException
		//1.ArithmeticException()运算异常
		//2.ClassCastException()类的转换异常
		//3.NullPointerException()空指针异常
		//4.IndexOutOfBoundsException()数组指针越界异常
		try{
 
			int i=10;
			int j = 0;
			System.out.println(i/j);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
 
		FileReader fr = null;
		try {
			fr = new FileReader("f:/test/dd/tt.txt");
		} catch (FileNotFoundException e) {//这个是IO异常，不是RuntimeException异常
			System.out.println("找不到文件");
			//			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
			}catch(IOException i){
			}
			catch (NullPointerException n) {
				System.out.println("空指针异常");
			}
		}
		try{
			int[] aa = {1,2,3};
			System.out.println(aa[3]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("数组越界！");
		}
 
		Map<String,String> map=new HashMap<String, String>();
		try{
			TreeMap<String ,String> map2=(TreeMap)map;
		}catch(ClassCastException c){
			System.out.println("类转换异常");
		}
		
		//自定义异常
		Person p = new Person();
		try{
			p.setAge(180);
 
		}catch(MyException m){
			m.printStackTrace();
		}
		try{
			p.setAge(20);
			System.out.println(p.getAge());
		}catch(MyException m){
			m.printStackTrace();
		}
	}

}
