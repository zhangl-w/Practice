package com.cxx.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxDemo {
	public static void main(String[] args) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		SAXDemoHandel handel = new SAXDemoHandel();
		saxParser.parse("src/com/cxx/xml/test.xml", handel);
	}
}
class SAXDemoHandel extends DefaultHandler {
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("sax解析开始");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("sax解析结束");
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		if(qName.equals("student")) {
			System.out.println("===================开始遍历student=========================");
			System.out.println(attributes.getValue("rollno"));
		}else if(!qName.equals("student")&&!qName.equals("class")) {
			System.out.println("节点名称"+qName+"------------");
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String value = new String(ch, start, length).trim();
		if(!value.equals("")) {
			System.out.println(value);
		}
	}
}