package com.neusoft.test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableTest {
	public static void main(String[] args) {
		//创建线程池
		ExecutorService exe = Executors.newCachedThreadPool();
		//创建Future的集合，用来存放所有线程
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		//线程作为线程池的参数，传入后线程池执行submit()方法，返回值装入results
		for (int i = 0; i < 5; i++) {
			results.add(exe.submit(new ManyCallableTasks(i)));
		}
		
		for(Future<String> fs : results) {
			if(!fs.isDone()) {
				try {
					System.out.println(fs.get());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}else {
				System.out.println("任务未完成");
			}
		}
		exe.shutdown();
	} 
}
class ManyCallableTasks implements Callable<String>{
	private int id;
	//重写构造方法，为每个线程加上id
	public ManyCallableTasks(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	//重写call()方法，返回值为字符串
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread"+id);
			Thread.sleep(1000);
		}
		return "Result of callable" + id;
	}
	
}