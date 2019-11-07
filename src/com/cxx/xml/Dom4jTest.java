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
	        //1.创建Reader对象
	        SAXReader reader = new SAXReader();
	        //2.加载xml
	        Document document = reader.read(new File("src/com/cxx/xml/test.xml"));
	        //3.获取根节点
	        Element rootElement = document.getRootElement();
	        Iterator iterator = rootElement.elementIterator();
	        while (iterator.hasNext()){
	            Element stu = (Element) iterator.next();
	            List<Attribute> attributes = stu.attributes();
	            System.out.println("======获取属性值======");
	            for (Attribute attribute : attributes) {
	                System.out.println(attribute.getValue());
	            }
	            System.out.println("======遍历子节点======");
	            Iterator iterator1 = stu.elementIterator();
	            while (iterator1.hasNext()){
	                Element stuChild = (Element) iterator1.next();
	                System.out.println("节点名："+stuChild.getName()+"---节点值："+stuChild.getStringValue());
	            }
	        }
	    }
	
}
