package com.neuedu.java;

import java.util.Random;

public class ceshi {
		public static void main(String[] args) {
		        /*int[] times = new int[100];//6�����ӵ�����,�洢���ֵĴ���
		        int n = 1000;//ѭ���Ĵ���
		        Random r= new Random();
		        for (int i = 0; i < n; i++) {
		            int num = r.nextInt(100)+1;//����1 �������1~6������
		            //int num = (int) (Math.random() * 6) + 1;//����2 �������1~6������
		            times[num - 1] = times[num - 1] + 1;//��������1
		        }
		         
		        for (int i = 0; i < times.length; i++) {
		            System.out.println((i + 1) + "���ֵĴ���" + times[i]);
		        }
		    }*/
		/*	String s = new String( "Computer" );
			if( s == "Computer" )
			System.out.println( "Equal A" );
			if( s.equals( "Computer" ) )
			System.out.println( "Equal B" );*/

			A a = new B();
			a.A();
			 
		}
	}
class A { 
    private int a = 100; 
    void A() { 
        System.out.print("A()"); 
        System.out.println(a); 
    } 
} 
class B extends A { 
    private int a = 200; 
    void B() { 
        System.out.print("B()"); 
        System.out.println(a); 
    } 
    
} 

 

		  






