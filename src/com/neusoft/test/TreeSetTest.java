package com.neusoft.test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * �ײ����ݽṹ�Ǻ������(Ψһ������)
 *1. ��α�֤Ԫ���������?
 *��Ȼ����
 *�Ƚ�������
 *2.��α�֤Ԫ��Ψһ�Ե���?
 *���ݱȽϵķ���ֵ�Ƿ���0������
 *3.TreeSet, LinkedHashSet and HashSet ������
 *TreeSet����Ҫ������������
 *LinkedHashSet����Ҫ�������ڱ�֤FIFO������ļ���(�Ƚ��ȳ�)
 *HashSetֻ��ͨ�õĴ洢���ݵļ���
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
