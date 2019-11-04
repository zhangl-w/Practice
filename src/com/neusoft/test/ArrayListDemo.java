package com.neusoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *  List ����,���ظ�
 *  ArrayList
 *	�ŵ�: �ײ����ݽṹ�����飬��ѯ�죬��ɾ����
 *	ȱ��: �̲߳���ȫ��Ч�ʸ�	
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//����һ���յ������������list��list�������String���͵�����
		ArrayList<String> list = new ArrayList<String>();
		
		//����Ԫ�ص�list������
		list.add("Item1");
		list.add("Item2");
		//������佫���"Item3"�ַ������ӵ�list�ĵ�����λ��
		list.add(2,"Item3");
		list.add("Item4");
		
		//��ʾ���������е�����
		System.out.println("The arraylist constains the following elements:"+list);
		
		//���Ԫ��λ��
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is:"+pos);
		
		//������������Ƿ�Ϊ��
		boolean check = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: "+check);
		
		//��ȡ����Ĵ�С
		int size = list.size();
		System.out.println("The size of the list is: "+size);
		
		//��������������Ƿ����ĳԪ��
		boolean element = list.contains("Item5");
		System.out.println("Checking if the arraylist constains the object Item5: "+element);
		
		//��ȡָ��λ��Ԫ��
		String item = list.get(0);
		System.out.println("The item is the index 0 is: "+item);
		
		//����arraylist�е�Ԫ��
		//1��ѭ��ʹ��Ԫ�ص�����������Ĵ�С
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: "+i+" - Item: "+list.get(i));
		}
		//2��ʹ��foreachѭ��
		for (String string : list) {
			System.out.println("Item is: " + string);
		}
		//3��ʹ�õ�����
		//hasNext():����true��ʾ��������
		//next():������һ��Ԫ��
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			System.out.println("Item is: "+iterator.next());
		}
		//�滻Ԫ��
		list.set(1, "NewItem");
		System.out.println("The arraylist after the replacement is: "+list);
		
		//�Ƴ�Ԫ��
		//�Ƴ���0��λ���ϵ�Ԫ��
		list.remove(0);
		
		//�Ƴ���һ���ҵ��ġ�Item��Ԫ��
		list.remove("Item3");
		System.out.println("The final contents of the arraylist are: "+list);
		
		//ת��ArrayListΪArray
		String[] simpleArray = list.toArray(new String[list.size()]);
		System.out.println("The array created after the conversion of our arraylist is :"+Arrays.toString(simpleArray));
		
	}
}
