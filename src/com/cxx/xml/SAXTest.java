package com.cxx.xml;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTest {
	public static void main(String[] args) {
		try {
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			saxParser.parse("src/com/cxx/xml/persons.xml", new MyDefaultHandler());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class MyDefaultHandler extends DefaultHandler{

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		System.out.print("<"+qName+">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.print(new String(ch,start,length));
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.print("<"+qName+">");
	}

	
}