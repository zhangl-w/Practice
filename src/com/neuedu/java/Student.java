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
public class Student {
	private int sno;
	private String sname;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student()
	{
		
	}
	public Student(int sno,String sname)
	{
		super();
		this.sno=sno;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [学号=" + sno + "  姓" + sname.charAt(0) + "  名："+sname.substring(1)+"]";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		return result;
	}*/
	//重写equals方法，如果两个学生的学号一致，
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		    {
			return true;
			}
		if (obj instanceof Student)
		    {
			Student another = (Student) obj;
			if(this.sno==another.getSno())
		        {
				    return true;
			    }
		    }
			return false;

	}
	
	
}

 