package com.cxx.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ServerParser {
	public static void main(String[] args) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read("src/com/cxx/xml/server.xml");
			Element connectorElt = (Element) document.selectSingleNode("//connector");
			Attribute porAttr = connectorElt.attribute("port");
			String port = porAttr.getStringValue();
			String port2 = connectorElt.attributeValue("port");
			System.out.println(port+ " "+port2);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
