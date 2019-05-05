package co.edureka;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "John", 20, "+91 99999 88888", "john@example.com");
		Student s2 = new Student(2, "Fionna", 22, "+91 88888 77777", "fionna@example.com");
		
		System.out.println(">> s1 is: "+s1);
		System.out.println(">> s2 is: "+s2);

		
		try {
			
			// 1. Create an XML Document
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//DocumentBuilder builder = factory.newDocumentBuilder();
			//Document document = builder.newDocument(); // Create an empty document (represents XML File)
			
			Document document = factory.newDocumentBuilder().newDocument(); 
			
			// 2. Create Tags in XML File
			Element elementRoot = document.createElement("students");
			Element elementStudent = document.createElement("student");
			Element elementRoll = document.createElement("roll");
			Element elementName = document.createElement("name");
			Element elementAge = document.createElement("age");
			Element elementPhone = document.createElement("phone");
			Element elementEmail = document.createElement("email");
			
			// 3. Create Data for Tags
			Text txtRoll = document.createTextNode(String.valueOf(s1.roll));
			Text txtName = document.createTextNode(s1.name);
			Text txtAge = document.createTextNode(String.valueOf(s1.age));
			Text txtPhone = document.createTextNode(s1.phone);
			Text txtEmail = document.createTextNode(s1.email);
			
			// 4. Add Data in Tags
			elementRoll.appendChild(txtRoll);
			elementName.appendChild(txtName);
			elementAge.appendChild(txtAge);
			elementPhone.appendChild(txtPhone);
			elementEmail.appendChild(txtEmail);
			
			// 5. Add Tags in Root Tag
			elementStudent.appendChild(elementRoll);
			elementStudent.appendChild(elementName);
			elementStudent.appendChild(elementAge);
			elementStudent.appendChild(elementPhone);
			elementStudent.appendChild(elementEmail);
			
			elementRoot.appendChild(elementStudent);
			
			// 6. Add Root Tag in the document
			document.appendChild(elementRoot);
			
			// 7. Generate XML File from document
			File file = new File("/users/ishantkumar/Downloads/myedurekastudents.xml");
			FileOutputStream outputStream = new FileOutputStream(file);
			StreamResult result = new StreamResult(outputStream);
			
			DOMSource source = new DOMSource(document);
			
			//DOMSource shall be converted into StreamResult : Transformer API shall do it
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			transformer.transform(source, result);
			
			System.out.println(">> XML File "+file.getName()+" Created");
				
		} catch (Exception e) {
			System.out.println(">> Some Exception : "+e);
		}
		
	}

}
