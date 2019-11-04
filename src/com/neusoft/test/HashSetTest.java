package com.neusoft.test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set 无序,唯一
 * HashSet
 * 保证元素唯一性:依赖两个方法：hashCode()和equals()
 */
public class HashSetTest {
	 public static void main(String[] args) {
		
	
		   // 新建HashSet
		   HashSet set = new HashSet();
		   // 将元素添加到Set中
		   set.add("a");
		   set.add("b");
		   set.add("c");
		   set.add("d");
		   set.add("e");
		   // 打印HashSet的实际大小
		   System.out.println("size : "+set.size());
		   // 判断HashSet是否包含某个值
		   System.out.println("HashSet contains a : "+ set.contains("a"));
		   System.out.println("HashSet contains g : "+ set.contains("g"));
		   // 删除HashSet中的“e”
		   set.remove("e");
		   // 将Set转换为数组
		   String[] arr = (String[])set.toArray(new String[set.size()]);
		   for (String str:arr)
		    System.out.println("for each :  "+ str);
		   // 新建一个包含b、c、f的HashSet
		   HashSet otherset = new HashSet();
		   otherset.add("b");
		   otherset.add("c");
		   otherset.add("f");
		   // 克隆一个removeset，内容和set一模一样
		   HashSet removeset = (HashSet)set.clone();
		   // 删除“removeset中，属于otherSet的元素”
		   removeset.removeAll(otherset);
		   // 打印removeset
		   System.out.println("removeset : "+ removeset);
		   // 克隆一个retainset，内容和set一模一样
		   HashSet retainset = (HashSet)set.clone();
		   // 保留“retainset中，属于otherSet的元素”
		   retainset.retainAll(otherset);
		   // 打印retainset
		   System.out.println("retainset : "+retainset);
		   // 遍历HashSet
		   for(Iterator iterator = set.iterator();
		    iterator.hasNext(); ) 
		    System.out.println("iterator : "+iterator.next());
		   // 清空HashSet
		   set.clear();
		   // 输出HashSet是否为空
		   System.out.println(" "+( set.isEmpty()?"set is empty":"set is not empty"));
	}
		 
}
