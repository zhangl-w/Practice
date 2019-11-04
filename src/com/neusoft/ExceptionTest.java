package com.neusoft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExceptionTest {
	public static void main(String[] args) {
		//������RuntimeException
		//1.ArithmeticException()�����쳣
		//2.ClassCastException()���ת���쳣
		//3.NullPointerException()��ָ���쳣
		//4.IndexOutOfBoundsException()����ָ��Խ���쳣
		try{
 
			int i=10;
			int j = 0;
			System.out.println(i/j);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
 
		FileReader fr = null;
		try {
			fr = new FileReader("f:/test/dd/tt.txt");
		} catch (FileNotFoundException e) {//�����IO�쳣������RuntimeException�쳣
			System.out.println("�Ҳ����ļ�");
			//			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
			}catch(IOException i){
			}
			catch (NullPointerException n) {
				System.out.println("��ָ���쳣");
			}
		}
		try{
			int[] aa = {1,2,3};
			System.out.println(aa[3]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("����Խ�磡");
		}
 
		Map<String,String> map=new HashMap<String, String>();
		try{
			TreeMap<String ,String> map2=(TreeMap)map;
		}catch(ClassCastException c){
			System.out.println("��ת���쳣");
		}
		
		//�Զ����쳣
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
