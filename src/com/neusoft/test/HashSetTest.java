package com.neusoft.test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set ����,Ψһ
 * HashSet
 * ��֤Ԫ��Ψһ��:��������������hashCode()��equals()
 */
public class HashSetTest {
	 public static void main(String[] args) {
		
	
		   // �½�HashSet
		   HashSet set = new HashSet();
		   // ��Ԫ����ӵ�Set��
		   set.add("a");
		   set.add("b");
		   set.add("c");
		   set.add("d");
		   set.add("e");
		   // ��ӡHashSet��ʵ�ʴ�С
		   System.out.println("size : "+set.size());
		   // �ж�HashSet�Ƿ����ĳ��ֵ
		   System.out.println("HashSet contains a : "+ set.contains("a"));
		   System.out.println("HashSet contains g : "+ set.contains("g"));
		   // ɾ��HashSet�еġ�e��
		   set.remove("e");
		   // ��Setת��Ϊ����
		   String[] arr = (String[])set.toArray(new String[set.size()]);
		   for (String str:arr)
		    System.out.println("for each :  "+ str);
		   // �½�һ������b��c��f��HashSet
		   HashSet otherset = new HashSet();
		   otherset.add("b");
		   otherset.add("c");
		   otherset.add("f");
		   // ��¡һ��removeset�����ݺ�setһģһ��
		   HashSet removeset = (HashSet)set.clone();
		   // ɾ����removeset�У�����otherSet��Ԫ�ء�
		   removeset.removeAll(otherset);
		   // ��ӡremoveset
		   System.out.println("removeset : "+ removeset);
		   // ��¡һ��retainset�����ݺ�setһģһ��
		   HashSet retainset = (HashSet)set.clone();
		   // ������retainset�У�����otherSet��Ԫ�ء�
		   retainset.retainAll(otherset);
		   // ��ӡretainset
		   System.out.println("retainset : "+retainset);
		   // ����HashSet
		   for(Iterator iterator = set.iterator();
		    iterator.hasNext(); ) 
		    System.out.println("iterator : "+iterator.next());
		   // ���HashSet
		   set.clear();
		   // ���HashSet�Ƿ�Ϊ��
		   System.out.println(" "+( set.isEmpty()?"set is empty":"set is not empty"));
	}
		 
}
