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
	            System.out.println("通过rollno获取属性值:"+child.getAttribute("rollno"));
	            List<Attribute> attributes = child.getAttributes();
	            for (Attribute attr : attributes) {
	                System.out.println(attr.getName()+":"+attr.getValue());
	            }
	            List<Element> childrenList = child.getChildren();
	            System.out.println("======获取子节点-start======");
	            for (Element o : childrenList) {
	                System.out.println("节点名:"+o.getName()+"---"+"节点值:"+o.getValue());
	            }
	            System.out.println("======获取子节点-end======");
	        }
	    }
	
}
