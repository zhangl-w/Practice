package com.neusoft.test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector
 * �ŵ�: �ײ����ݽṹ�����飬��ѯ�죬��ɾ����
 *ȱ��: �̰߳�ȫ��Ч�ʵ�
 */
public class VectorTest {
	
	    public static void main(String[] args) {
	        // �½�Vector
	        Vector vec = new Vector();
	            
	        // ���Ԫ��
	        vec.add("1");
	        vec.add("2");
	        vec.add("3");
	        vec.add("4");
	        vec.add("5");

	        // ���õ�һ��Ԫ��Ϊ100
	        vec.set(0, "100");
	        // ����500�����뵽��3��λ��
	        vec.add(2, "300");
	        System.out.println("vec:"+vec);

	        // (˳�����)��ȡ100������
	        System.out.println("vec.indexOf(100):"+vec.indexOf("100"));
	        // (�������)��ȡ100������
	        System.out.println("vec.lastIndexOf(100):"+vec.lastIndexOf("100"));
	        // ��ȡ��һ��Ԫ��
	        System.out.println("vec.firstElement():"+vec.firstElement());
	        // ��ȡ��3��Ԫ��
	        System.out.println("vec.elementAt(2):"+vec.elementAt(2));
	        // ��ȡ���һ��Ԫ��
	        System.out.println("vec.lastElement():"+vec.lastElement());

	        // ��ȡVector�Ĵ�С
	        System.out.println("size:"+vec.size());
	        // ��ȡVector���ܵ�����
	        System.out.println("capacity:"+vec.capacity());

	        // ��ȡvector�ġ���2��������4����Ԫ��
	        System.out.println("vec 2 to 4:"+vec.subList(1, 4));

	        // ͨ��Enumeration����Vector
	        Enumeration enu = vec.elements();
	        while(enu.hasMoreElements())
	            System.out.println("nextElement():"+enu.nextElement());
	            
	        Vector retainVec = new Vector();
	        retainVec.add("100");
	        retainVec.add("300");
	        // ��ȡ��vec���а����ڡ�retainVec�е�Ԫ�ء��ļ���
	        System.out.println("vec.retain():"+vec.retainAll(retainVec));
	        System.out.println("vec:"+vec);
	            
	        // ��ȡvec��Ӧ��String����
	        String[] arr = (String[]) vec.toArray(new String[0]);
	        for (String str:arr)
	            System.out.println("str:"+str);

	        // ���Vector��clear()��removeAllElements()һ����
	        vec.clear();
//	        vec.removeAllElements();

	        // �ж�Vector�Ƿ�Ϊ��
	        System.out.println("vec.isEmpty():"+vec.isEmpty());
	  }   
	
}
