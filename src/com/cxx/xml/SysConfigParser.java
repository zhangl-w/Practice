package com.cxx.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class SysConfigParser {
	public static void main(String[] args) {
		try {
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read("src/com/cxx/xml/sys-config.xml");
			Element driverNameElt = (Element) document.selectSingleNode("/config/database-info/dirver-name");
			String driverName = driverNameElt.getStringValue();
			System.out.println(driverName);
			Element urlElt = (Element) document.selectSingleNode("config//url");
			String url = urlElt.getStringValue();
			System.out.println(url);
			Element userElt = (Element) document.selectObject("//user");
			String user = userElt.getText();
			System.out.println(user);
			Element passwordElt = (Element) document.selectSingleNode("//password");
			String password = passwordElt.getText();
			System.out.println(password);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
