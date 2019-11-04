package com.neusoft.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
/**
 * LinkedHashSet
 * �ײ����ݽṹ������͹�ϣ��(FIFO��������,Ψһ)
 *1.������֤Ԫ������
 *2.�ɹ�ϣ��֤Ԫ��Ψһ
 */
public class LinkedHashSetTest {
	public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            linkedHashSet.add("I" + i);
            hashSet.add("I" + i);
        }

        System.out.println("linkedHashSet������");
        for (String string : linkedHashSet){
            System.out.print(string + " ");
        }
        System.out.println();

        System.out.println("hashSet������");
        for (String string : hashSet){
            System.out.print(string + " ");
        }
    }
}
