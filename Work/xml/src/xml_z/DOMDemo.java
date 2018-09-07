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
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws Exception {
		read_1();
		//read_2();
		// read_3();
		 
		// read_4() ;
		// delete_5();
	}
	private static void read_1() throws Exception {

		    //1，创建工厂
		 DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	        //2，得到dom解析器
		 DocumentBuilder db= dbf.newDocumentBuilder();	 
		    //3.解析xml文档，得到代表文档的document
		 Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
		 //操作得到的数据；遍历出自己想要得到的数据
		 NodeList list=d.getElementsByTagName("作者");
		 
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
        
        
        
        Element n=(Element) d.getElementsByTagName("书架").item(0);
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
		   
		   //创建一个子节点，当试图将对象强制转换为不是实例的子类时，抛出该异常。例如，以下代码将生成一个 
		   Node n= d.createElement("售价");
		   n.setTextContent("19.99");
		   
		   //挂在哪个母节点下面最后面
		   Node e=d.getElementsByTagName("书").item(0);
		   e.appendChild(n);
		   //更新后的内容·1写回xml文档
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer ts=tff.newTransformer();
		   ts.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));								
	   }
	   private static void read_4() throws Exception {
		   
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db=dbf.newDocumentBuilder();
		   Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
		 //创建子节点
		   Node n=d.createElement("售价");
		   n.setTextContent("19.99");
		   //得到参考节点
		   Node no=d.getElementsByTagName("售价").item(0);
		   //挂在哪母结点下面
		   Node father=d.getElementsByTagName("书").item(0);
		   //节点加入书标签，售价元素前面
		   father.insertBefore(n, no);
		   
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer t=tff.newTransformer();
		   t.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));
		   
		   
		   
		   }
	   private static void delete_5() throws Exception {
		   
		   
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db=dbf.newDocumentBuilder();
		   Document d=db.parse("C:\\Users\\Administrator\\Desktop\\first.xml");
	      //删除的节点
		   
		   
		   Node no=d.getElementsByTagName("售价").item(0);
	
		 //挂在哪母结点下面删除
		   Node father=d.getElementsByTagName("书").item(0);
		   father.removeChild(no);
		   //写进xml文件
		   
		   
		   
		   TransformerFactory tff=TransformerFactory.newInstance();
		   Transformer t=tff.newTransformer();
		   t.transform(new DOMSource(d), new StreamResult(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.xml")));
		   
		   
		   
		   }
}
