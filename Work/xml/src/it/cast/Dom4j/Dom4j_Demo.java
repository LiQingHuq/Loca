package it.cast.Dom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import javax.sql.rowset.spi.XmlWriter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class Dom4j_Demo {

	@Test
	public void read() throws Exception{
		 SAXReader reader = new SAXReader();
	     Document document = reader.read(new File("src\\xml_z\\NewFile.xml"));
	     
	     
	     Element element=document.getRootElement();
	     Element student=(Element) element.elements("student").get(1);
	     String value=student.element("name").getText();
	    //String value = student.element("name").attributeValue("name");
	     System.out.println(value);
	}
	
	@Test
	public void add() throws Exception{
		 SAXReader reader = new SAXReader();
	     Document document = reader.read(new File("src\\xml_z\\NewFile.xml"));
	     
	     Element element=document.getRootElement().element("student");
	     element.addElement("id").setText("1");
	     
	     XMLWriter writer=new XMLWriter(new OutputStreamWriter(new FileOutputStream("src\\xml_z\\NewFile.xml"),"utf-8"));
          writer.write(document);
          writer.close();
	     
	}
	}
