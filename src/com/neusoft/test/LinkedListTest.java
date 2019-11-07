package com.neusoft.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList
 * 优点: 底层数据结构是链表，查询慢，增删快。
 * 缺点: 线程不安全，效率高
 */

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add(1,"123");
		
		//分别在头部和尾部添加元素
		list.addFirst("top");
		list.addLast("bottom");
		System.out.println(list);
		
		//数组克隆
		Object listClone = list.clone();
		System.out.println(listClone);
		
		//创建一个首尾互换的迭代器
		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println();
		list.clear();
		System.out.println("list.contains('111') ? " + list.contains("111"));
		
		Collection<String> collec = Arrays.asList("123","213","321");
		list.addAll(collec);
		System.out.println(list);
		System.out.println("list.element = " + list.element());
		System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.getFirst() = " + list.getFirst());
        System.out.println("list.getLast() = " + list.getLast());
        // 检索指定元素出现的位置
        System.out.println("list.indexOf(213) = " + list.indexOf("213"));
        list.add("123");
        System.out.println("list.lastIndexOf(123) = " + list.lastIndexOf("123"));
         // 在首部和尾部添加元素
        list.offerFirst("first");
        list.offerLast("999");
        System.out.println("list = " + list);
        list.offer("last");
        // 只访问，不移除指定元素
        System.out.println("list.peek() = " + list.peek());
        System.out.println("list.peekFirst() = " + list.peekFirst());
        System.out.println("list.peekLast() = " + list.peekLast());

        // 访问并移除元素
        System.out.println("list.poll() = " + list.poll());
        System.out.println("list.pollFirst() = " + list.pollFirst());
        System.out.println("list.pollLast() = " + list.pollLast());
        System.out.println("list = " + list);
        // 从首部弹出元素
        list.pop();
        // 压入元素
        list.push("123");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);

        // remove操作
        System.out.println(list.remove());
        System.out.println(list.remove(1));
        System.out.println(list.remove("999"));
        System.out.println(list.removeFirst());
        System.out.println("list = " + list);

        list.addAll(collec);
        list.addFirst("123");
        list.addLast("123");
        System.out.println("list = " + list);
        list.removeFirstOccurrence("123");
        list.removeLastOccurrence("123");
        list.removeLast();
        System.out.println("list = " + list);
        list.addFirst("top");
        list.addLast("bottom");
        list.set(2,"321");
        System.out.println("list = " + list);
        System.out.println("--------------------------");

        // 创建一个list的双向链表
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            // 移到list的末端
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------------");
        while (listIterator.hasPrevious()){
            // 移到list的首端
            System.out.println(listIterator.previous());
        }   
	}
}
