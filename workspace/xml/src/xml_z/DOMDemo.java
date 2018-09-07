package xml_z;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMDemo {

	public DOMDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) throws Exception {
		read_1();
		//read_2();
		// read_3();
		 
		// read_4() ;
		// delete_5();
	}
	private static void read_1() throws Exception {

		    //1����������
		 DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	        //2���õ�dom������
		 DocumentBuilder db= dbf.newDocumentBuilder();	 
		    //3.����xml�ĵ����õ������ĵ���document
		 Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
		 //�����õ������ݣ��������Լ���Ҫ�õ�������
		 NodeList list=d.getElementsByTagName("����");
		 
		 int i=0;
		 
		 for(i=0;i<list.getLength();i++){
		 String s=list.item(i).getTextContent();	 	 
		 System.out.println(s);
		 }
	}
	private static void read_2() throws Exception{
		DocumentBuilderFactory bdf=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=bdf.newDocumentBuilder();
        Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml"); 
        
        
        
        Element n=(Element) d.getElementsByTagName("���").item(0);
        read(n);       
	 }
	   public static void read(Element n){		
		 System.out.println(n.getNodeName());		 
		 NodeList list=n.getChildNodes();
		 for(int i=0;i<list.getLength();i++)
	        {
	        	Element no=(Element) list.item(i);
	        	read(no);
	        }
	}
	   private static void read_3() throws Exception{
		   
		   
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db=dbf.newDocumentBuilder();
		   Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
		   
		   //����һ���ӽڵ㣬����ͼ������ǿ��ת��Ϊ����ʵ��������ʱ���׳����쳣�����磬���´��뽫����һ�� 
		   Node n= d.createElement("�ۼ�");
		   n.setTextContent("19.99");
		   
		   //�����ĸ�ĸ�ڵ����������
		   Node e=d.getElementsByTagName("��").item(0);
		   e.appendChild(n);
		   //���º�����ݡ�1д��xml�ĵ�
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer ts=tff.newTransformer();
		   ts.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));								
	   }
	   private static void read_4() throws Exception {
		   
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db=dbf.newDocumentBuilder();
		   Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
		 //�����ӽڵ�
		   Node n=d.createElement("�ۼ�");
		   n.setTextContent("19.99");
		   //�õ��ο��ڵ�
		   Node no=d.getElementsByTagName("�ۼ�").item(0);
		   //������ĸ�������
		   Node father=d.getElementsByTagName("��").item(0);
		   //�ڵ�������ǩ���ۼ�Ԫ��ǰ��
		   father.insertBefore(n, no);
		   
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer t=tff.newTransformer();
		   t.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));
		   
		   
		   
		   }
	   private static void delete_5() throws Exception {
		   
		   
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db=dbf.newDocumentBuilder();
		   Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
	      //ɾ���Ľڵ�
		   
		   
		   Node no=d.getElementsByTagName("�ۼ�").item(0);
	
		 //������ĸ�������ɾ��
		   Node father=d.getElementsByTagName("��").item(0);
		   father.removeChild(no);
		   //д��xml�ļ�
		   
		   
		   
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer t=tff.newTransformer();
		   t.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));
		   
		   
		   
		   }
}
