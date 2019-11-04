package com.cxx.xml;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
public class DomDemo {
	/**
	 * @Author: cxx
	 * Dom����xml
	 * @Date: 2018/5/29 20:19
	 */
	 //��Element��ʽ
    public static void element(NodeList list){
        for (int i = 0; i <list.getLength() ; i++) {
            Element element = (Element) list.item(i);
            NodeList childNodes = element.getChildNodes();
            for (int j = 0; j <childNodes.getLength() ; j++) {
                if (childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {
                    //��ȡ�ڵ�
                    System.out.print(childNodes.item(j).getNodeName() + ":");
                    //��ȡ�ڵ�ֵ
                    System.out.println(childNodes.item(j).getFirstChild().getNodeValue());
                }
            }
        }
    }

    public static void node(NodeList list){
        for (int i = 0; i <list.getLength() ; i++) {
            Node node = list.item(i);
            NodeList childNodes = node.getChildNodes();
            for (int j = 0; j <childNodes.getLength() ; j++) {
                if (childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {
                    System.out.print(childNodes.item(j).getNodeName() + ":");
                    System.out.println(childNodes.item(j).getFirstChild().getNodeValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        //1.����DocumentBuilderFactory����
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.����DocumentBuilder����
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document d = builder.parse("src/main/resources/demo.xml");
            NodeList sList = d.getElementsByTagName("student");
            //element(sList);
            node(sList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
