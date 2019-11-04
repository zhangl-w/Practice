package com.neuedu.java;
/**
 * 4、请利用密钥{1，2，-1，2，2}通过凯撒加密法对明文字符数组
 * {'h','e','l','l','o','w','o','r','l','d'}进行加密
 * 凯撒加密法：利用密钥 对明文进行位移
 * 设计方法sercet{char[]str,int[]key},使用密钥对明文str加密并返回密文
 *
 */
public class Test4 {
	
	public static char[] miwen(char[]str,int key[])
	{
		char[] m = new char[str.length];
		for(int i = 0;i<str.length;i++)
		{
			m[i]=(char)(str[i]+key[i%5]);
		}
		return m;
	}

	
	
	
	
	public static void main(String[] args) {
	char[] c={'h','e','l','l','o','w','o','r','l','d'};
	int[] key={1,2,-1,0,2};
	/*
	 * c[0] key[0]
	 * c[1] key[1]
	 * c[2] key[2]
	 * c[3] key[3]
	 * c[4] key[4]
	 * 
	 * c[5] key[0]
	 * c[6] key[1]
	 * c[7] key[2]
	 * c[8] key[3]
	 * c[9] key[4]
	 */
	/*char[] m = new char[c.length];
	for(int i = 0;i<c.length;i++)
	{
		m[i]=(char)(c[i]+key[i%key.length]);
	}
	for(char item:m)
	{
		System.out.println(item);
	}*/
	
	char[] m =miwen(c,key);
	for(int i = 0;i<m.length;i++)
	{
		System.out.print(m[i]+"\t");
	}
	
	}
}
