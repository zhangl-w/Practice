package com.neusoft.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortTest {
	public static void main(String[] args) {
        //定义一个数组，长度为10
        int arr[] = new int[10];
        //随机生成0到20的随机数填充数组
        for(int i = 0;i<arr.length;i++){
            arr[i] =(int)( Math.random()*20);
        }
        //输出未排序前的数组
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //换行
        System.out.println();
       /* //进行冒泡排序
        for(int i =1;i<=arr.length-1;i++)
            //第二层循环，最大的数排到数组底部
            for(int j = 1;j<=arr.length-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }*/
        Arrays.sort(arr);
        //输出查看结果
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
		return "总H --"+sumH+" 总Count--"+count;
	}
//	public static List<Object> getList(int listsize){
//	List<Object> list = new ArrayList<Object>();
//	Random r = new Random();
//	if(listsize<1) {
//		list.add("长度不合法");
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
