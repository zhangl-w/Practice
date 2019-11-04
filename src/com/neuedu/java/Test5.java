package com.neuedu.java;

import java.util.Scanner;

/**
 * 学生管理系统
利用面向对象知识设计并实现以下系统
学生
学号  int
姓名  String
本题可自行根据需要添加属性和方法

在控制台上显示以下内容
*********************************************
1-	新增学生
2-	删除学生
3-	修改学生信息
4-	查询所有学生信息
5-	退出
**********************************************


根据控制台内容，输入数字完成相关内容
比如：
输入1时，新增学生时，依次提示用户输入学号，姓名，并将输入的内容保存在一个Student对象中，该对象存放在一个Student数组中
输入2时，先提示输入学号，根据学号在数组中找到对应的学生，然后在数组中移除该对象
输入3时，先提示输入学号，根据学号在数组中找到对应的学生并要求输入新的姓名（学号不可更改）
输入4时，遍历数组显示所有学生信息
 */
public class Test5 {

	public static void main(String[] args) {
		//Scanner sc1 = new Scanner(System.in);
	    //创建学生数组
    	Student[] s= new Student[50];
    	//数组中已经存了几个学生
    	int index = 0;
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
		if(select == 1){
			//选择了新增
			if(index<50)
			{
				//控制台上依次提示输入学号，姓名。
				
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				//System.out.println("请输入学号，姓名");
				System.out.println("请输入学号");
				int sno = sc1.nextInt();
				System.out.println("请输入姓名");
				String sname = sc2.nextLine();
				//next接受到有效字符之后结束，nextLine 读取一行，接受到回车键之后结束
				//新建学生对象
				//将学号和姓名存入新建的对象中
				Student as = new Student(sno,sname);
				//再将对象放入数组中
				s[index]=as;
				index++;
				System.out.println("保存成功");
					
			}else{
				System.out.println("学生人数已满");
		    }
			
	       }
		else if(select == 2)
		{
			Scanner sc3 = new Scanner(System.in);
			System.out.println("请输入学号");
			int sno = sc3.nextInt();
			boolean b = false;
			int index1 =-1;
			for(int i =0;i<index;i++)
			{
				if(s[i].getSno()==sno)
				{
					index1=i;
					for(int j= index1+1;j<index;j++)
					{
						s[j-1]=s[j];
					}
					index--;
					System.out.println("学生删除成功");
					b = true;
				}
			}
			if(!b)
			{
				System.out.println("没有找到该学生");
			}
		}
		else if(select == 3)
		{
			System.out.println("请输入学号");
			int sno = sc.nextInt();
			boolean b = false;
			//查找数组中是否有输入该学号
			
			for(int i = 0;i<index;i++)
			{
				if(s[i].getSno()==sno)
				{
					System.out.println("请输入新的姓名");
					Scanner sc4 = new Scanner(System.in);
					String sname = sc4.nextLine();
					s[i].setSname(sname);
					System.out.println("修改成功");
					b = true;
				}
			}
			if(!b)
			{
				System.out.println("没有找到该学生");
			}
			
		}
		else if(select == 4)
		{
			/*for(Student item:s)
			{
				System.out.println(item);
			}*/
			//存多少学生，遍历多少学生
			for(int i = 0;i<index;i++)
			{
				System.out.println(s[i].toString());
			}
		}
		else if(select==5){
			break;
		   }
		
        }
    }
}

