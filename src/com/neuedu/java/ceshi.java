package com.neuedu.java;

import java.util.Random;

public class ceshi {
		public static void main(String[] args) {
		        /*int[] times = new int[100];//6个格子的数组,存储出现的次数
		        int n = 1000;//循环的次数
		        Random r= new Random();
		        for (int i = 0; i < n; i++) {
		            int num = r.nextInt(100)+1;//方法1 随机产生1~6的数字
		            //int num = (int) (Math.random() * 6) + 1;//方法2 随机产生1~6的数字
		            times[num - 1] = times[num - 1] + 1;//次数增加1
		        }
		         
		        for (int i = 0; i < times.length; i++) {
		            System.out.println((i + 1) + "出现的次数" + times[i]);
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

 

		  






