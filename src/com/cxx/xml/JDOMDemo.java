package com.cxx.xml;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOMDemo {
	 public static void main(String[] args) throws Exception {
	        SAXBuilder saxBuilder = new SAXBuilder();
	        InputStream is = new FileInputStream(new File("src/com/cxx/xml/test.xml"));
	        Document document = saxBuilder.build(is);
	        Element rootElement = document.getRootElement();
	        List<Element> children = rootElement.getChildren();
	        for (Element child : children) {
	            System.out.println("ͨ��rollno��ȡ����ֵ:"+child.getAttribute("rollno"));
	            List<Attribute> attributes = child.getAttributes();
	            for (Attribute attr : attributes) {
	                System.out.println(attr.getName()+":"+attr.getValue());
	            }
	            List<Element> childrenList = child.getChildren();
	            System.out.println("======��ȡ�ӽڵ�-start======");
	            for (Element o : childrenList) {
	                System.out.println("�ڵ���:"+o.getName()+"---"+"�ڵ�ֵ:"+o.getValue());
	            }
	            System.out.println("======��ȡ�ӽڵ�-end======");
	        }
	    }
	
}
