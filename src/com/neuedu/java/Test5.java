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
public class Test5 {

	public static void main(String[] args) {
		//Scanner sc1 = new Scanner(System.in);
	    //����ѧ������
    	Student[] s= new Student[50];
    	//�������Ѿ����˼���ѧ��
    	int index = 0;
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
		if(select == 1){
			//ѡ��������
			if(index<50)
			{
				//����̨��������ʾ����ѧ�ţ�������
				
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				//System.out.println("������ѧ�ţ�����");
				System.out.println("������ѧ��");
				int sno = sc1.nextInt();
				System.out.println("����������");
				String sname = sc2.nextLine();
				//next���ܵ���Ч�ַ�֮�������nextLine ��ȡһ�У����ܵ��س���֮�����
				//�½�ѧ������
				//��ѧ�ź����������½��Ķ�����
				Student as = new Student(sno,sname);
				//�ٽ��������������
				s[index]=as;
				index++;
				System.out.println("����ɹ�");
					
			}else{
				System.out.println("ѧ����������");
		    }
			
	       }
		else if(select == 2)
		{
			Scanner sc3 = new Scanner(System.in);
			System.out.println("������ѧ��");
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
					System.out.println("ѧ��ɾ���ɹ�");
					b = true;
				}
			}
			if(!b)
			{
				System.out.println("û���ҵ���ѧ��");
			}
		}
		else if(select == 3)
		{
			System.out.println("������ѧ��");
			int sno = sc.nextInt();
			boolean b = false;
			//�����������Ƿ��������ѧ��
			
			for(int i = 0;i<index;i++)
			{
				if(s[i].getSno()==sno)
				{
					System.out.println("�������µ�����");
					Scanner sc4 = new Scanner(System.in);
					String sname = sc4.nextLine();
					s[i].setSname(sname);
					System.out.println("�޸ĳɹ�");
					b = true;
				}
			}
			if(!b)
			{
				System.out.println("û���ҵ���ѧ��");
			}
			
		}
		else if(select == 4)
		{
			/*for(Student item:s)
			{
				System.out.println(item);
			}*/
			//�����ѧ������������ѧ��
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

