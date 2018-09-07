package it.cast.Sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import it.cast.Entity.Student;

public class SaxDemo {

	public SaxDemo() {
		// TODO 自动生成的构造函数存根
	}
	//SAX文档解析·
   public static void main(String[] args) throws Exception, SAXException {
	  //创建解析器工厂
	   SAXParserFactory spf= SAXParserFactory.newInstance();
	   //得到解析器
      SAXParser sp= spf.newSAXParser();
	   //得到读取器
      XMLReader xr= sp.getXMLReader();
	   //设置内容处理器
      ListhHandlerBy handler= new ListhHandlerBy();
         xr.setContentHandler(handler);
	   //读取xml文档
       xr.parse("src\\xml_z\\Newxml.xml");
	   List<Student> li=handler.getList();
	   System.out.println(li);
 }
}
//用户回去标签内容，常用
class ListhHandlerBy extends DefaultHandler{
	private List<Student> list=new ArrayList<Student>();
    private Student student;
    private String Tag;
    
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	
		 Tag=qName;
		 if("name".equals(Tag)){
			 student=new Student();
		 }
	}


	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		if("name".equals(Tag)){
			String name=new String(ch, start, length);		
			student.setName(name);
		}
		if("location".equals(Tag)){
			String location=new String(ch, start, length);
			student.setLocation(location);	
		}
		if("grade".equals(Tag)){
			String grade=new String(ch, start, length);
			student.setGrade(grade);
		}
	}
	

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO 自动生成的方法存根
		if(qName.equals("student")){
			list.add(student);
			student=null;
		}
		Tag=null;
	}
	
	public List<Student> getList() {
		return list;
	}
}

/*

//获取所有的标签
 class ListHandler implements ContentHandler{

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void startElement(String uri, String localName, String Name, Attributes atts) throws SAXException {
		// TODO 自动生成的方法存根
		System.out.print("<"+Name+">");		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		System.out.print(new String (ch,start,length));
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO 自动生成的方法存根
		
	}
	
}
 
 //获取指定的xml标签
 
 class TagValueHandler extends DefaultHandler{
   String tag;
   int neednum=3;
   int currnum;
	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
		// TODO 自动生成的方法存根
		return super.resolveEntity(publicId, systemId);
	}

	@Override
	public void notationDecl(String name, String publicId, String systemId) throws SAXException {
		// TODO 自动生成的方法存根
		super.notationDecl(name, publicId, systemId);
	}

	@Override
	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
			throws SAXException {
		// TODO 自动生成的方法存根
		super.unparsedEntityDecl(name, publicId, systemId, notationName);
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO 自动生成的方法存根
		super.setDocumentLocator(locator);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO 自动生成的方法存根
		super.endDocument();
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO 自动生成的方法存根
		super.startPrefixMapping(prefix, uri);
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO 自动生成的方法存根
		super.endPrefixMapping(prefix);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO 自动生成的方法存根
		tag=qName;
		if(tag.equals("name")){
			currnum++;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO 自动生成的方法存根
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		if("name".equals(tag)&&currnum==neednum){
			System.out.println(new String (ch,start,length));
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO 自动生成的方法存根
		super.ignorableWhitespace(ch, start, length);
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO 自动生成的方法存根
		super.processingInstruction(target, data);
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO 自动生成的方法存根
		super.skippedEntity(name);
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// TODO 自动生成的方法存根
		super.warning(e);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		// TODO 自动生成的方法存根
		super.error(e);
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		// TODO 自动生成的方法存根
		super.fatalError(e);
	}

	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO 自动生成的方法存根
		super.finalize();
	}
	
	 
 }*/
