
package com.cxx.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MyXPathTest {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
			Document document = builder.parse("src/com/cxx/xml/bookstore.xml");
			XPath xPath = XPathFactory.newInstance().newXPath();
			/* 1.��ȡbookstore�ڵ���book����categoryֵΪweb�µĵڶ���title
			�ڵ���ı����� */
			String titleXpath = "/bookstore/book[@category='web'][2]/title/text()";
			String titleValue = (String) xPath.evaluate(titleXpath, document, XPathConstants.STRING);
			System.out.println(titleValue);
//			2.��ȡbookstore�ڵ���book����categoryֵΪweb��title����Ϊen�Ľڵ����ݡ�
			String titleLangXpath = "/bookstore/book[@category='web']/title[@lang='en']/text()";
			String titleLangValue = (String)xPath.evaluate(titleLangXpath, document, XPathConstants.STRING);
			System.out.println(titleLangValue);
//			3.��ȡbookstore��book����categoryֵΪcooking��title��lang����ֵ
			String titleLangAttrXpath = "/bookstore/book[@category='cooking']/title/@lang";
			String titleLangAttrValue = (String)xPath.evaluate(titleLangAttrXpath, document, XPathConstants.STRING);
			System.out.println(titleLangAttrValue);
//			4.��ȡbookstore�ڵ������еĽڵ㼯��
			NodeList bookList = (NodeList) xPath.evaluate("/bookstore/book", document, XPathConstants.NODESET);
			for (int i = 0; i < bookList.getLength(); i++) {
				Element bookElt = (Element) bookList.item(i);
				String titleValue01 = (String) xPath.evaluate("title", bookElt, XPathConstants.STRING);
				String authorValue = (String) xPath.evaluate("author", bookElt, XPathConstants.STRING);
				String year = (String) xPath.evaluate("year", bookElt, XPathConstants.STRING);
				String price = (String) xPath.evaluate("price", bookElt, XPathConstants.STRING);
				System.out.println(titleValue01+" "+authorValue+" "+year+" "+price);
				System.out.println("--------------------------------");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
