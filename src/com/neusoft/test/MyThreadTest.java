package com.neusoft.test;

class MyThread extends Thread {
	String name;
	public MyThread(String name) {
		this.name = name;
		System.out.println("�̳�Thread��");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println(this.name+":"+i+"-"+currentThread().getId());
		}
	}
	
}
public class MyThreadTest{
	public static void main(String[] args) {
		//��������Ķ���
		MyThread thread1 = new MyThread("one");
		MyThread thread2 = new MyThread("two");
		//�����߳�
		thread1.start();
		thread2.start();
	}
}
