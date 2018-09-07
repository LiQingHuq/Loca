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
		// TODO �Զ����ɵĹ��캯�����
	}
	//SAX�ĵ�������
   public static void main(String[] args) throws Exception, SAXException {
	  //��������������
	   SAXParserFactory spf= SAXParserFactory.newInstance();
	   //�õ�������
      SAXParser sp= spf.newSAXParser();
	   //�õ���ȡ��
      XMLReader xr= sp.getXMLReader();
	   //�������ݴ�����
      ListhHandlerBy handler= new ListhHandlerBy();
         xr.setContentHandler(handler);
	   //��ȡxml�ĵ�
       xr.parse("src\\xml_z\\Newxml.xml");
	   List<Student> li=handler.getList();
	   System.out.println(li);
 }
}
//�û���ȥ��ǩ���ݣ�����
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
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
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

//��ȡ���еı�ǩ
 class ListHandler implements ContentHandler{

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void startElement(String uri, String localName, String Name, Attributes atts) throws SAXException {
		// TODO �Զ����ɵķ������
		System.out.print("<"+Name+">");		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO �Զ����ɵķ������
		System.out.print(new String (ch,start,length));
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO �Զ����ɵķ������
		
	}
	
}
 
 //��ȡָ����xml��ǩ
 
 class TagValueHandler extends DefaultHandler{
   String tag;
   int neednum=3;
   int currnum;
	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
		// TODO �Զ����ɵķ������
		return super.resolveEntity(publicId, systemId);
	}

	@Override
	public void notationDecl(String name, String publicId, String systemId) throws SAXException {
		// TODO �Զ����ɵķ������
		super.notationDecl(name, publicId, systemId);
	}

	@Override
	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
			throws SAXException {
		// TODO �Զ����ɵķ������
		super.unparsedEntityDecl(name, publicId, systemId, notationName);
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO �Զ����ɵķ������
		super.setDocumentLocator(locator);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO �Զ����ɵķ������
		super.endDocument();
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO �Զ����ɵķ������
		super.startPrefixMapping(prefix, uri);
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO �Զ����ɵķ������
		super.endPrefixMapping(prefix);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO �Զ����ɵķ������
		tag=qName;
		if(tag.equals("name")){
			currnum++;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO �Զ����ɵķ������
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO �Զ����ɵķ������
		if("name".equals(tag)&&currnum==neednum){
			System.out.println(new String (ch,start,length));
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO �Զ����ɵķ������
		super.ignorableWhitespace(ch, start, length);
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO �Զ����ɵķ������
		super.processingInstruction(target, data);
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO �Զ����ɵķ������
		super.skippedEntity(name);
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// TODO �Զ����ɵķ������
		super.warning(e);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		// TODO �Զ����ɵķ������
		super.error(e);
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		// TODO �Զ����ɵķ������
		super.fatalError(e);
	}

	@Override
	public int hashCode() {
		// TODO �Զ����ɵķ������
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO �Զ����ɵķ������
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO �Զ����ɵķ������
		super.finalize();
	}
	
	 
 }*/
