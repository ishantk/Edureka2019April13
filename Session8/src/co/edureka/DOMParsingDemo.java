package co.edureka;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParsingDemo {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myedurekastudents.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // XML Parsing is to extract data
			
			System.out.println("Root Element of Document is: "+document.getDocumentElement().getNodeName());
			
			NodeList nodes = document.getElementsByTagName("student");
			System.out.println(">> "+nodes.getLength()+" student elements found in "+file.getName());
			
			for(int i=0;i<nodes.getLength();i++){
				Node node = nodes.item(i);
				Element element = (Element)node;
				
				System.out.println(element.getElementsByTagName("roll").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("age").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("phone").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("email").item(0).getTextContent());
				
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception : "+e);
		}

	}

}
