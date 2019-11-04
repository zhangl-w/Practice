package com.neuedu.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
	    //创建学生数组
    	//Student[] s= new Student[50];
    	//数组中已经存了几个学生
    	//int index = 0;
    while(true){
	    Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("1- 新增学生");
		System.out.println("2- 删除学生");
		System.out.println("3- 修改学生信息");
		System.out.println("4- 查询所有学生信息");
		System.out.println("5- 退出");
		System.out.println("*****************");
		System.out.println("请选择操作： ");
		int select = sc.nextInt();
		switch(select)
		{
		case 1:
		{
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入学号");
			int sno = sc1.nextInt();
			Student temp = new Student();
			temp.setSno(sno);
			if(list.contains(temp))
			{
				
				System.out.println("学号已经存在");
			}
			else
			{
				System.out.println("请输入姓名");
				String sname = sc2.nextLine();
				Student as = new Student(sno,sname);
				list.add(as);
				System.out.println("保存成功");
			}
			
		    break;
		}
		case 2:
		{
			Scanner sc3 = new Scanner(System.in);
			System.out.println("请输入学号");
			int sno = sc3.nextInt();
			Student temp = new Student();//用户输入的用于在集合中寻找的对象
			temp.setSno(sno);
			if(list.contains(temp))
			{
				list.remove(temp);
				System.out.println("学生删除成功");
			}
			else
			{
				System.out.println("该学生不存在");
			}
			break;
		}
		case 3:
		{
			System.out.println("请输入学号");
			int sno = sc.nextInt();
			Student temp = new Student();//用户输入的用于在集合中寻找的对象
			temp.setSno(sno);
			if(list.contains(temp))
			{
				System.out.println("请输入新的姓名");
				Scanner sc4 = new Scanner(System.in);
				String sname = sc4.nextLine();
				//temp.setSname(sname);
				list.remove(temp);
				list.add(new Student(sno,sname));
				System.out.println("修改成功");
			}
			else
			{
				System.out.println("该学生不存在");
			}
			break;
		}
		case 4:
		{
			for(Object item:list)
			{
				System.out.println(item);
			}
			/*for(int i=0;i<list.size();i++)
			{
				System.out.println(list.toString());
			}*/
			break;
		}
		case 5:
		   {
			   System.out.println("已经退出系统");
			   break;
		   }
		default :
		{
			System.out.println("输入错误，请重新选择");
		}
        }
      }
    }
}





