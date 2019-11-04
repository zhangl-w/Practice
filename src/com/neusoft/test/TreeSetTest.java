package com.neusoft.test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * 底层数据结构是红黑树。(唯一，有序)
 *1. 如何保证元素排序的呢?
 *自然排序
 *比较器排序
 *2.如何保证元素唯一性的呢?
 *根据比较的返回值是否是0来决定
 *3.TreeSet, LinkedHashSet and HashSet 的区别
 *TreeSet的主要功能用于排序
 *LinkedHashSet的主要功能用于保证FIFO即有序的集合(先进先出)
 *HashSet只是通用的存储数据的集合
 */
public class TreeSetTest {
	 public static void main(String [] args)
	    {
	       TreeSet ts=new TreeSet();
	       ts.add("orange");
	       ts.add("apple");
	       ts.add("banana");
	       ts.add("grape");
	 
	       Iterator it=ts.iterator();
	       while(it.hasNext())
	       {
	           String fruit=(String)it.next();
	           System.out.println(fruit);
	       }
	    }
}
