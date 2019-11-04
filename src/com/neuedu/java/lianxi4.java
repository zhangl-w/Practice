package com.neuedu.java;

import java.util.Scanner;

public class lianxi4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*学生管理系统
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
	*///创建学生数组
		
			/**
			 * 学生管理系统
			 */
		          
					//创建学生数组，用于保存学生信息
					Studentfu[] ss = new Studentfu[50];
					//数组中已经存入了几个学生
					int idx = 0;
					while(true){
						Scanner sc = new Scanner(System.in);
						System.out.println("***************");
						System.out.println("1-	新增学生");
						System.out.println("2-	删除学生");
						System.out.println("3-	修改学生信息");
						System.out.println("4-	查询所有学生信息");
						System.out.println("5-	退出");
						System.out.println("***************");
						System.out.println("请选择操作：");
						int select = sc.nextInt();
						if(select==1){
							//选择了新增
							if(idx<50){
								//控制台上提示用户输入学号
								System.out.println("请输入学生的学号：");
								Scanner sc1 = new Scanner(System.in);
								int sno = sc1.nextInt();
								//控制台上提示用户输入姓名
								System.out.println("请输入学生的姓名：");
								Scanner sc2 = new Scanner(System.in);
								String sname = sc2.nextLine();
								//新建Student对象
								//将学号和姓名存入Student对象
								Studentfu s = new Studentfu(sno,sname);
								//将Student对象放入数组中
								ss[idx] = s;
								idx++;
								System.out.println("学生保存成功");
							}else{
								System.out.println("学生人数已满");
							}				
						}else if(select==2){
							//数组无法删除,只能往前移位.移动后下标减一
							Scanner sc3 = new Scanner(System.in);
							System.out.println("请输入学生的学号：");
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
								  System.out.println("学生以删除");
								  b=true;
								  
								}
							}
						if(!b){
							System.out.println("没有找到对应学生");
						}
						}else if(select==3){
							Scanner sc1 = new Scanner(System.in);
							System.out.println("请输入学生的学号：");
							int sno = sc1.nextInt();
							boolean b = false;
							//查找数组中是否有该学号
							for(int i = 0;i<idx;i++){
								if(ss[i].getSno()==sno){
									Scanner sc2 = new Scanner(System.in);
									System.out.println("请输入新的姓名：");
									String sname = sc2.nextLine();
									ss[i].setSname(sname);
									System.out.println("修改成功");
									b = true;
								}
							}
							if(!b){
								System.out.println("没有找到对应的学生");
							}
							
						}else if(select==4){
							for(int i = 0;i < idx;i++){
								System.out.println(ss[i].toString());
							}
					
						}
						else if(select==5){
							System.out.println("退出");
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
			return "Student [学号=" + sno + "  姓" + sname.charAt(0) + "  名："+sname.substring(1)+"]";

		}
	   //先打上要重写的,然后ALT+?重写的快捷键
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


