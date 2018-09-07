package cn.itcast.Utils;

import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Xml_Utils {

	public Xml_Utils() {
		// TODO 自动生成的构造函数存根
	}
	public static String fileName="D:\\workspace\\Java_Xml\\src\\Student.xml";
     public static Document getDocument() throws Exception{
    	DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
    	DocumentBuilder db=dbf.newDocumentBuilder();
    	Document d=db.parse(fileName);
    	 return d;
     }
     public static void  writeToFile(Document document) throws Exception{
    	 TransformerFactory tf=TransformerFactory.newInstance();
    	 Transformer t=tf.newTransformer();
    	 t.transform(new DOMSource(document), new StreamResult(new FileOutputStream(fileName)));
    			 
     }
} 
