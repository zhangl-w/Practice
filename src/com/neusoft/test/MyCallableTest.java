package com.neusoft.test;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableTest {
	public static void main(String[] args) {
		//�����̳߳�
		ExecutorService exe = Executors.newCachedThreadPool();
		//����Future�ļ��ϣ�������������߳�
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		//�߳���Ϊ�̳߳صĲ�����������̳߳�ִ��submit()����������ֵװ��results
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
				System.out.println("����δ���");
			}
		}
		exe.shutdown();
	} 
}
class ManyCallableTasks implements Callable<String>{
	private int id;
	//��д���췽����Ϊÿ���̼߳���id
	public ManyCallableTasks(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	//��дcall()����������ֵΪ�ַ���
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