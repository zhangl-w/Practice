package com.neuedu.java;

import java.util.Scanner;

public class lianxi4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*ѧ������ϵͳ
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
	*///����ѧ������
		
			/**
			 * ѧ������ϵͳ
			 */
		          
					//����ѧ�����飬���ڱ���ѧ����Ϣ
					Studentfu[] ss = new Studentfu[50];
					//�������Ѿ������˼���ѧ��
					int idx = 0;
					while(true){
						Scanner sc = new Scanner(System.in);
						System.out.println("***************");
						System.out.println("1-	����ѧ��");
						System.out.println("2-	ɾ��ѧ��");
						System.out.println("3-	�޸�ѧ����Ϣ");
						System.out.println("4-	��ѯ����ѧ����Ϣ");
						System.out.println("5-	�˳�");
						System.out.println("***************");
						System.out.println("��ѡ�������");
						int select = sc.nextInt();
						if(select==1){
							//ѡ��������
							if(idx<50){
								//����̨����ʾ�û�����ѧ��
								System.out.println("������ѧ����ѧ�ţ�");
								Scanner sc1 = new Scanner(System.in);
								int sno = sc1.nextInt();
								//����̨����ʾ�û���������
								System.out.println("������ѧ����������");
								Scanner sc2 = new Scanner(System.in);
								String sname = sc2.nextLine();
								//�½�Student����
								//��ѧ�ź���������Student����
								Studentfu s = new Studentfu(sno,sname);
								//��Student�������������
								ss[idx] = s;
								idx++;
								System.out.println("ѧ������ɹ�");
							}else{
								System.out.println("ѧ����������");
							}				
						}else if(select==2){
							//�����޷�ɾ��,ֻ����ǰ��λ.�ƶ����±��һ
							Scanner sc3 = new Scanner(System.in);
							System.out.println("������ѧ����ѧ�ţ�");
							boolean b = false;
							int sno = sc3.nextInt();
						    int index=-1;
						    for (int i = 0; i <idx ; i++) {
								if(ss[i].getSno()==sno){
									index=i;
									for(int j=index+1;j<idx;j++){
										ss[j-1]=ss[j];
									}
								  idx--;
								  System.out.println("ѧ����ɾ��");
								  b=true;
								  
								}
							}
						if(!b){
							System.out.println("û���ҵ���Ӧѧ��");
						}
						}else if(select==3){
							Scanner sc1 = new Scanner(System.in);
							System.out.println("������ѧ����ѧ�ţ�");
							int sno = sc1.nextInt();
							boolean b = false;
							//�����������Ƿ��и�ѧ��
							for(int i = 0;i<idx;i++){
								if(ss[i].getSno()==sno){
									Scanner sc2 = new Scanner(System.in);
									System.out.println("�������µ�������");
									String sname = sc2.nextLine();
									ss[i].setSname(sname);
									System.out.println("�޸ĳɹ�");
									b = true;
								}
							}
							if(!b){
								System.out.println("û���ҵ���Ӧ��ѧ��");
							}
							
						}else if(select==4){
							for(int i = 0;i < idx;i++){
								System.out.println(ss[i].toString());
							}
					
						}
						else if(select==5){
							System.out.println("�˳�");
							break;
						}
					}
					

				}

		
			}
	class Studentfu {

		private int sno;
		private String sname;

		public Studentfu() {

		}

		public Studentfu(int sno, String sname) {
			super();
			this.sno = sno;
			this.sname = sname;

		}

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
		@Override
		public String toString() {
			
			//return super.toString();
			return "Student [ѧ��=" + sno + "  ��" + sname.charAt(0) + "  ����"+sname.substring(1)+"]";

		}
	   //�ȴ���Ҫ��д��,Ȼ��ALT+?��д�Ŀ�ݼ�
		@Override
		public boolean equals(Object obj) {
		        if (this == obj) {
		            return true;
		        }
		        if (obj instanceof Studentfu) {
		        	Studentfu another = (Studentfu) obj; 
		        	if(this.sno==another.getSno()){
		        		 return true;   
		        	}
		                }
		                   
		        return false;
		    }
	} 


