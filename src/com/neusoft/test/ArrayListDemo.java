package com.neusoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *  List 有序,可重复
 *  ArrayList
 *	优点: 底层数据结构是数组，查询快，增删慢。
 *	缺点: 线程不安全，效率高	
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建一个空的数组链表对象list，list用来存放String类型的数据
		ArrayList<String> list = new ArrayList<String>();
		
		//增加元素到list对象中
		list.add("Item1");
		list.add("Item2");
		//此条语句将会把"Item3"字符串增加到list的第三个位置
		list.add(2,"Item3");
		list.add("Item4");
		
		//显示数组链表中的内容
		System.out.println("The arraylist constains the following elements:"+list);
		
		//检查元素位置
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is:"+pos);
		
		//检查数组链表是否为空
		boolean check = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: "+check);
		
		//获取链表的大小
		int size = list.size();
		System.out.println("The size of the list is: "+size);
		
		//检查数组链表中是否包含某元素
		boolean element = list.contains("Item5");
		System.out.println("Checking if the arraylist constains the object Item5: "+element);
		
		//获取指定位置元素
		String item = list.get(0);
		System.out.println("The item is the index 0 is: "+item);
		
		//遍历arraylist中的元素
		//1、循环使用元素的索引和链表的大小
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: "+i+" - Item: "+list.get(i));
		}
		//2、使用foreach循环
		for (String string : list) {
			System.out.println("Item is: " + string);
		}
		//3、使用迭代器
		//hasNext():返回true表示链表中素
		//next():返回下一个元素
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			System.out.println("Item is: "+iterator.next());
		}
		//替换元素
		list.set(1, "NewItem");
		System.out.println("The arraylist after the replacement is: "+list);
		
		//移除元素
		//移除第0个位置上的元素
		list.remove(0);
		
		//移除第一次找到的“Item”元素
		list.remove("Item3");
		System.out.println("The final contents of the arraylist are: "+list);
		
		//转换ArrayList为Array
		String[] simpleArray = list.toArray(new String[list.size()]);
		System.out.println("The array created after the conversion of our arraylist is :"+Arrays.toString(simpleArray));
		
	}
}
