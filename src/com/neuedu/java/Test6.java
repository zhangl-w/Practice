package com.neuedu.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
	    //����ѧ������
    	//Student[] s= new Student[50];
    	//�������Ѿ����˼���ѧ��
    	//int index = 0;
    while(true){
	    Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("1- ����ѧ��");
		System.out.println("2- ɾ��ѧ��");
		System.out.println("3- �޸�ѧ����Ϣ");
		System.out.println("4- ��ѯ����ѧ����Ϣ");
		System.out.println("5- �˳�");
		System.out.println("*****************");
		System.out.println("��ѡ������� ");
		int select = sc.nextInt();
		switch(select)
		{
		case 1:
		{
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("������ѧ��");
			int sno = sc1.nextInt();
			Student temp = new Student();
			temp.setSno(sno);
			if(list.contains(temp))
			{
				
				System.out.println("ѧ���Ѿ�����");
			}
			else
			{
				System.out.println("����������");
				String sname = sc2.nextLine();
				Student as = new Student(sno,sname);
				list.add(as);
				System.out.println("����ɹ�");
			}
			
		    break;
		}
		case 2:
		{
			Scanner sc3 = new Scanner(System.in);
			System.out.println("������ѧ��");
			int sno = sc3.nextInt();
			Student temp = new Student();//�û�����������ڼ�����Ѱ�ҵĶ���
			temp.setSno(sno);
			if(list.contains(temp))
			{
				list.remove(temp);
				System.out.println("ѧ��ɾ���ɹ�");
			}
			else
			{
				System.out.println("��ѧ��������");
			}
			break;
		}
		case 3:
		{
			System.out.println("������ѧ��");
			int sno = sc.nextInt();
			Student temp = new Student();//�û�����������ڼ�����Ѱ�ҵĶ���
			temp.setSno(sno);
			if(list.contains(temp))
			{
				System.out.println("�������µ�����");
				Scanner sc4 = new Scanner(System.in);
				String sname = sc4.nextLine();
				//temp.setSname(sname);
				list.remove(temp);
				list.add(new Student(sno,sname));
				System.out.println("�޸ĳɹ�");
			}
			else
			{
				System.out.println("��ѧ��������");
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
			   System.out.println("�Ѿ��˳�ϵͳ");
			   break;
		   }
		default :
		{
			System.out.println("�������������ѡ��");
		}
        }
      }
    }
}





