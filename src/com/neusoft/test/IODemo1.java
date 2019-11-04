package com.neusoft.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * 序列流 序列流合并文件
 */
/*
 * SequenceInputStream(序列流)
 */
public class IODemo1 {
	public static void main(String[] args) throws IOException {
		merge2();
	}
	//把3个文件合并成一个文件
	public static void merge3() throws IOException {
		File file1 = new File("D:\\a.txt");
		File file2 = new File("D:\\b.txt");
		File file3 = new File("D:\\c.txt");
		File file4 = new File("D:\\d.txt");
		// 建立对应的输入输出流对象
		FileOutputStream fileOutputStream = new FileOutputStream(file4);
		FileInputStream fileInputStream1 = new FileInputStream(file1);
		FileInputStream fileInputStream2 = new FileInputStream(file2);
		FileInputStream fileInputStream3 = new FileInputStream(file3);
		// 创建序列流对象
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		vector.add(fileInputStream1);
		vector.add(fileInputStream2);
		vector.add(fileInputStream3);
		Enumeration<FileInputStream> e = vector.elements();
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
		// 读取文件数据
		byte[] buf = new byte[1024];
		int length = 0;
		while ((length = sequenceInputStream.read(buf)) != -1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequenceInputStream.close();
		fileOutputStream.close();
	}

	// SequenceInputStream合并文件夹
	public static void merge2() throws IOException {
		File inFile1 = new File("D:\\a.txt");
		File inFile2 = new File("D:\\b.txt");
		File outFile = new File("D:\\c.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		// 建立序列流对象
		SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = inputStream.read(buf)) != -1) {
			fileOutputStream.write(buf, 0, len);
		}
		inputStream.close();
		fileOutputStream.close();
	}

	// 合并a.txt和b.txt内容
	public static void merge1() throws IOException {
		File inFile1 = new File("D:\\a.txt");
		File inFile2 = new File("D:\\b.txt");
		File outFile = new File("D:\\c.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outFile);
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		List<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		byte[] buf = new byte[1024];
		int length = 0;
		for (int i = 0; i < list.size(); i++) {
			FileInputStream fileInputStream = list.get(i);
			while ((length = fileInputStream.read(buf)) != -1) {
				fileOutputStream.write(buf, 0, length);
			}
			fileInputStream.close();
		}
	}
}
