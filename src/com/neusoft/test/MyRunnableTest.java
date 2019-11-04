package com.neusoft.test;

public class MyRunnableTest {
	public static void main(String[] args) {
		//创建Runnable类对象
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		//把对象作为实参传递给Thread类
		Thread thread3 = new Thread(t1,"three");
		Thread thread4 = new Thread(t2,"four");
		thread3.start();
		thread4.start();

	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub

//		System.out.println("this"+this);
//		System.out.println("Thread" + Thread.currentThread());
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}