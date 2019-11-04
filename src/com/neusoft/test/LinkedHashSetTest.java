package com.neusoft.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
/**
 * LinkedHashSet
 * 底层数据结构是链表和哈希表。(FIFO插入有序,唯一)
 *1.由链表保证元素有序
 *2.由哈希表保证元素唯一
 */
public class LinkedHashSetTest {
	public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            linkedHashSet.add("I" + i);
            hashSet.add("I" + i);
        }

        System.out.println("linkedHashSet遍历：");
        for (String string : linkedHashSet){
            System.out.print(string + " ");
        }
        System.out.println();

        System.out.println("hashSet遍历：");
        for (String string : hashSet){
            System.out.print(string + " ");
        }
    }
}
