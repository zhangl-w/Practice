package com.neusoft.test;

public class Test6 {
	/**
	 * ==���ԱȽϻ����������͡�������������, �����Ƚϵ���ֵ ���õ�ʱ��Ƚϵ��ǵ�ַ
	 * .equals ֻ�ܱȽ������������� �Ƚϵ��ǵ�ַ
	 */
//		private int t6;
//		private int t7;
	//��д����
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
