package com.neusoft.test;

public class Test6 {
	/**
	 * ==可以比较基本数据类型、引用数据类型, 基本比较的是值 引用的时候比较的是地址
	 * .equals 只能比较引用数据类型 比较的是地址
	 */
//		private int t6;
//		private int t7;
	//重写方法
		public static void main(String[] args) {
			Test6 t6 = new Test6();
			Test6 t7 = new Test6();
			
			System.out.println(t6);
			System.out.println(t7);
			System.out.println(t6.equals(t7));
			System.out.println(t6==t7);
			System.out.println(t6.hashCode());
			
		}
	
		
		
		
		
	
}
