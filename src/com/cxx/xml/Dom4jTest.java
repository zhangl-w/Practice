package com.cxx.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	 public static void main(String[] args) throws Exception {
	        //1.����Reader����
	        SAXReader reader = new SAXReader();
	        //2.����xml
	        Document document = reader.read(new File("src/com/cxx/xml/test.xml"));
	        //3.��ȡ���ڵ�
	        Element rootElement = document.getRootElement();
	        Iterator iterator = rootElement.elementIterator();
	        while (iterator.hasNext()){
	            Element stu = (Element) iterator.next();
	            List<Attribute> attributes = stu.attributes();
	            System.out.println("======��ȡ����ֵ======");
	            for (Attribute attribute : attributes) {
	                System.out.println(attribute.getValue());
	            }
	            System.out.println("======�����ӽڵ�======");
	            Iterator iterator1 = stu.elementIterator();
	            while (iterator1.hasNext()){
	                Element stuChild = (Element) iterator1.next();
	                System.out.println("�ڵ�����"+stuChild.getName()+"---�ڵ�ֵ��"+stuChild.getStringValue());
	            }
	        }
	    }
	
}
