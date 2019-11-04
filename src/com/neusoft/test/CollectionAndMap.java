package com.neusoft.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 * 
 * Collection：一个独立元素的序列，这些元素都服从一条或者多条规则。
 *  		  List必须按照插入的顺序保存元素，而set不能有重复的元素。
 *  		  Queue按照排队规则来确定对象产生的顺序（通常与它们被插入的顺序相同）。 
 *	Map：一组成对的“键值对”对象，允许你使用键来查找值。
 */
public class CollectionAndMap {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill(Map<String,String> map) {
		map.put("rat", "小黑");
		map.put("cat", "小花");
		map.put("dog", "大黄");
		map.put("dog", "二黄");
		return map;
	}
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));
	}
}
