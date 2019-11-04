package com.neusoft.test;

class MyThread extends Thread {
	String name;
	public MyThread(String name) {
		this.name = name;
		System.out.println("继承Thread类");
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
		//创建子类的对象
		MyThread thread1 = new MyThread("one");
		MyThread thread2 = new MyThread("two");
		//启动线程
		thread1.start();
		thread2.start();
	}
}
