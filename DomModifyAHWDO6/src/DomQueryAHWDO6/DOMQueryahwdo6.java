package DomQueryAHWDO6;

import java.io.*;


import javax.xml.parsers.*;
import javax.xml.transform.*;


import org.w3c.dom.*;
import org.xml.sax.*;

public class DOMQueryahwdo6 {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
	File xmlFile = new File("XY_XML.xml");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = factory.newDocumentBuilder();
	Document doc = dBuilder.parse(xmlFile); 
	
	System.out.println("Gyökér elem:" + doc.getDocumentElement().getNodeName()+"\n");
	
	
	System.out.println("Azok a szakácsok, akiknek a végzettségeik között van szakközépiskola: \n");
	
	NodeList nodelist = doc.getElementsByTagName("szakacs");
	
	for (int i = 0; i < nodelist.getLength(); i++) {
		
	}
	}
	
}
