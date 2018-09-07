package cn.itcast.studentdao;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import cn.itcast.Exception.StudentNotExistException;
import cn.itcast.Utils.Xml_Utils;
import cn.itcast.domain.Students;

public class StudentDao {

	public StudentDao() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
  public  void add(Students s){
	   try {
		Document d=Xml_Utils.getDocument();
		
		//���ѧ����Ϣ��ǩ
		
		Element e_tag=d.createElement("studnet");//��ǩ
		e_tag.setAttribute("examid", s.getIdcard());//����
		e_tag.setAttribute("idcard", s.getExamid());//����
		
		
        //������������ڵأ��ɼ���ǩ			
		Element e_name=d.createElement("name");
		Element e_location=d.createElement("location");
		Element e_grade=d.createElement("grade");
		
		//��ӱ�ǩ����		
		e_name.setTextContent(s.getName());
		e_location.setTextContent(s.getLocation());
		e_grade.setTextContent(s.getGrade());
		
		
		//�������ȱ�ǩ����student��ǩ��
		e_tag.appendChild(e_name);
		e_tag.appendChild(e_location);
		e_tag.appendChild(e_grade);
		
		//��student����exam����
		d.getElementsByTagName("exam").item(0).appendChild(e_tag);
		//д��
		Xml_Utils.writeToFile(d);
	
	} catch (Exception e) {
		// TODO �Զ����ɵ� catch ��
		throw new RuntimeException(e);
	}
	   
   }
   public  Students find(String examid) {
	   	   	  try {
				Document d=Xml_Utils.getDocument();
				NodeList li=d.getElementsByTagName("student");
				for(int i=0;i<li.getLength();i++){
					Element e_tag=(Element) li.item(i);
					//�õ�student��ǩ�Ժ��ҵ��������ԣ��Լ������ӱ�ǩ��װ��student�෵��
					if(e_tag.getAttribute("examid").equals(examid)){										
					Students stu=new Students();
					stu.setExamid(examid);
					stu.setIdcard(e_tag.getAttribute("idcard"));
					stu.setName(e_tag.getElementsByTagName("name").item(0).getTextContent());
					stu.setLocation(e_tag.getElementsByTagName("location").item(0).getTextContent());
					stu.setGrade(e_tag.getElementsByTagName("grade").item(0).getTextContent());
				     return stu;
					}					
				}
				 return null;
				
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				throw new RuntimeException(e);
			}
	   	   	 
	   	   	  
   }
   
  public void delete (String name){
	  try {
		Document d=Xml_Utils.getDocument();
		NodeList li=d.getElementsByTagName("student");
		for(int i=0;i>li.getLength();i++){
			Element e_tag= (Element) li.item(i);
			if(e_tag.getTextContent().equals(name)){
				li.item(i).getParentNode().getParentNode().removeChild(li.item(i).getParentNode());
				Xml_Utils.writeToFile(d);
			}
		}
		 throw new  StudentNotExistException(name+"�����ڣ����������룡");
	} catch (Exception e) {
		// TODO �Զ����ɵ� catch ��
		throw new RuntimeException(e);
	}
   }
}
