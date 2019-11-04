package com.neusoft.test;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		/*System.out.println("您的大乐透号码为：");
		for (int i = 0; i < 10; i++) {
			int random=(int)(Math.random()*100);
			System.out.print(random+" ");
		}*/
		
		/*String [] arr = {"黑桃","红桃","梅花","方片"};
		String [] arr1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (String string : arr) {
			for (String string1 : arr1) {
				System.out.print(string+string1+" ");
			}
			System.out.println();
		}*/		
		
		/*String [] arr = {"黑桃","红桃","梅花","方片"};
		String [] arr1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String [] all = new String[54];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				all[index] = arr[i]+arr1[j];
				index++;
			}
		}
		all[52] = "小王";
		all[53] = "大王";
		int num = 1;
		int num1 = 5;
		int num2 = 50;
		String[] s = new String[3];
		s[0] = all[num-1];
		s[1] = all[num1-1];
		s[2] = all[num2-1];
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}*/
		
		/*char[] charArray = {'a','l','f',+'m','f','o','b','b','s','n'};
		printCount(charArray);	
	}
	public static void printCount(char[] charArray) {
		int[] count = new int[26];
		for (int i = 0; i < charArray.length; i++) {
			int c = charArray[i];
			count[c-97]++;
		}
		for (int i = 0,ch = 97; i < count.length; i++,ch++) {
			if (count[i] != 0) {
				System.out.println((char)ch+"=="+count[i]);
			}
			
		}*/
		
		/*int[] arr = {95,92,75,56,98,71,80,58,91,91};
		getAvg(arr);
	}
	public static void getAvg(int[] arr) {
		int count = 0;
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>a/arr.length) {
				count++;
			}
		}
		System.out.println("高于平均分："+a/arr.length+" 的 个数有"+count+" 个");*/
		
		/*int[] arr = {1,2,3,4,3,2,1};
		int[] arr2 = {1,2,3,4,5,2,1};
		sys(arr);
		sys(arr2);
	}
	public static void sys(int[] arr) {
		String out = "";
		for (int s = 0,e = arr.length-1; s <= (arr.length-1)/2; s++,e--) {
			if(arr[s]!=arr[e]) {
				out = Arrays.toString(arr)+" 是否对称：false";
			}else {
				out = Arrays.toString(arr)+" 是否对称：true";
			}
			
		}
		System.out.println(out);*/
		
		/*int[] arr = {1,2,3,4,3,2,1};
		int[] arr2 = {1,2,3,4,3,2,1};
		equals(arr,arr2);
	}
	public static void equals(int[] arr,int[] arr2) {
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		String a = "";
		if (arr.length!=arr2.length) {
			a = "false";
		}else {
			for (int i = 0; i < arr.length; i++) {
					if (arr[i]==arr2[i]) {
						a = "true";
					}else {
						a = "false";
						break;
					}
			}	
		}
		System.out.println(" 是否一致："+a);*/
		
		
	}
}
