package com.neusoft.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList
 * �ŵ�: �ײ����ݽṹ��������ѯ������ɾ�졣
 * ȱ��: �̲߳���ȫ��Ч�ʸ�
 */

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add(1,"123");
		
		//�ֱ���ͷ����β�����Ԫ��
		list.addFirst("top");
		list.addLast("bottom");
		System.out.println(list);
		
		//�����¡
		Object listClone = list.clone();
		System.out.println(listClone);
		
		//����һ����β�����ĵ�����
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
        // ����ָ��Ԫ�س��ֵ�λ��
        System.out.println("list.indexOf(213) = " + list.indexOf("213"));
        list.add("123");
        System.out.println("list.lastIndexOf(123) = " + list.lastIndexOf("123"));
         // ���ײ���β�����Ԫ��
        list.offerFirst("first");
        list.offerLast("999");
        System.out.println("list = " + list);
        list.offer("last");
        // ֻ���ʣ����Ƴ�ָ��Ԫ��
        System.out.println("list.peek() = " + list.peek());
        System.out.println("list.peekFirst() = " + list.peekFirst());
        System.out.println("list.peekLast() = " + list.peekLast());

        // ���ʲ��Ƴ�Ԫ��
        System.out.println("list.poll() = " + list.poll());
        System.out.println("list.pollFirst() = " + list.pollFirst());
        System.out.println("list.pollLast() = " + list.pollLast());
        System.out.println("list = " + list);
        // ���ײ�����Ԫ��
        list.pop();
        // ѹ��Ԫ��
        list.push("123");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);

        // remove����
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

        // ����һ��list��˫������
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            // �Ƶ�list��ĩ��
            System.out.println(listIterator.next());
        }
        System.out.println("--------------------------");
        while (listIterator.hasPrevious()){
            // �Ƶ�list���׶�
            System.out.println(listIterator.previous());
        }   
	}
}
