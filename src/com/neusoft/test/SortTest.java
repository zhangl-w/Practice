package com.neusoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortTest {
	public static void main(String[] args) {
        //����һ�����飬����Ϊ10
        int arr[] = new int[10];
        //�������0��20��������������
        for(int i = 0;i<arr.length;i++){
            arr[i] =(int)( Math.random()*20);
        }
        //���δ����ǰ������
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //����
        System.out.println();
       /* //����ð������
        for(int i =1;i<=arr.length-1;i++)
            //�ڶ���ѭ�����������ŵ�����ײ�
            for(int j = 1;j<=arr.length-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }*/
        Arrays.sort(arr);
        //����鿴���
        for(int i = 0;i<arr.length;i++){
        	
            System.out.print(arr[i]+" ");
        }
        System.out.println();
                

//        List<Object> list = getList(0);
//       for (Object object : list) {
//    	   System.out.println(object);
//       }
        System.out.println(getSumHandCount(100));
    }

	public static String getSumHandCount(int h) {
		int count = 0;
		int sumH = h ;
		for(;;) {
			h = h/2;
			System.out.println(h);
			sumH += h;
			count ++;
			if(h==1) {
				break;
			}
		}
		return "��H --"+sumH+" ��Count--"+count;
	}
//	public static List<Object> getList(int listsize){
//	List<Object> list = new ArrayList<Object>();
//	Random r = new Random();
//	if(listsize<1) {
//		list.add("���Ȳ��Ϸ�");
//		
//	}else {
//		for (;;) {
//        	int a=r.nextInt(100);
//        	if(!list.contains(a)) 	
//        	list.add(a);
//        	if(list.size()==listsize)
//        		break;
//		}
//	}
//	return list;
//	
//}
}
