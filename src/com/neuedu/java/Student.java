package com.neuedu.java;

import java.util.Scanner;
/**
 * ѧ������ϵͳ
�����������֪ʶ��Ʋ�ʵ������ϵͳ
ѧ��
ѧ��  int
����  String
��������и�����Ҫ������Ժͷ���

�ڿ���̨����ʾ��������
*********************************************
1-	����ѧ��
2-	ɾ��ѧ��
3-	�޸�ѧ����Ϣ
4-	��ѯ����ѧ����Ϣ
5-	�˳�
**********************************************


���ݿ���̨���ݣ�������������������
���磺
����1ʱ������ѧ��ʱ��������ʾ�û�����ѧ�ţ�������������������ݱ�����һ��Student�����У��ö�������һ��Student������
����2ʱ������ʾ����ѧ�ţ�����ѧ�����������ҵ���Ӧ��ѧ����Ȼ�����������Ƴ��ö���
����3ʱ������ʾ����ѧ�ţ�����ѧ�����������ҵ���Ӧ��ѧ����Ҫ�������µ�������ѧ�Ų��ɸ��ģ�
����4ʱ������������ʾ����ѧ����Ϣ
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
		return "Student [ѧ��=" + sno + "  ��" + sname.charAt(0) + "  ����"+sname.substring(1)+"]";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		return result;
	}*/
	//��дequals�������������ѧ����ѧ��һ�£�
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

 