package com.cxx.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;


public class Dom4jDemo {
	 public static void main(String[] args) throws Exception {
		
		        //1.创建Reader对象
		        SAXReader reader = new SAXReader();
		        //2.加载xml
		        Document document = reader.read(new File("src/com/cxx/xml/test.xml"));
		        //3.获取根节点
		        Element rootElement = document.getRootElement();
		        for(Iterator<Element> iterator = rootElement.elementIterator();iterator.hasNext();) {
		        	Element studentElt = iterator.next();
		        	for(Iterator<Element> innerIter = studentElt.elementIterator();innerIter.hasNext();) {
		        		Element innerElt = innerIter.next();
		        		String innerValue = innerElt.getStringValue();
		        		System.out.println(innerValue);
		        	}
		        	System.out.println("---------------------------------------");
		        }
		        
		    
		
	    }
	
}
