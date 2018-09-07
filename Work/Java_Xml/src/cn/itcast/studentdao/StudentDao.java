package cn.itcast.studentdao;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import cn.itcast.Exception.StudentNotExistException;
import cn.itcast.Utils.Xml_Utils;
import cn.itcast.domain.Students;

public class StudentDao {

	public StudentDao() {
		// TODO 自动生成的构造函数存根
	}
	
	
  public  void add(Students s){
	   try {
		Document d=Xml_Utils.getDocument();
		
		//添加学生信息标签
		
		Element e_tag=d.createElement("studnet");//标签
		e_tag.setAttribute("examid", s.getIdcard());//属性
		e_tag.setAttribute("idcard", s.getExamid());//属性
		
		
        //添加姓名，所在地，成绩标签			
		Element e_name=d.createElement("name");
		Element e_location=d.createElement("location");
		Element e_grade=d.createElement("grade");
		
		//添加标签内容		
		e_name.setTextContent(s.getName());
		e_location.setTextContent(s.getLocation());
		e_grade.setTextContent(s.getGrade());
		
		
		//将姓名等标签挂在student标签下
		e_tag.appendChild(e_name);
		e_tag.appendChild(e_location);
		e_tag.appendChild(e_grade);
		
		//将student挂在exam下面
		d.getElementsByTagName("exam").item(0).appendChild(e_tag);
		//写入
		Xml_Utils.writeToFile(d);
	
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		throw new RuntimeException(e);
	}
	   
   }
   public  Students find(String examid) {
	   	   	  try {
				Document d=Xml_Utils.getDocument();
				NodeList li=d.getElementsByTagName("student");
				for(int i=0;i<li.getLength();i++){
					Element e_tag=(Element) li.item(i);
					//得到student标签以后找到他的属性，以及他的子标签封装到student类返回
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
				// TODO 自动生成的 catch 块
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
		 throw new  StudentNotExistException(name+"不存在，请重新输入！");
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		throw new RuntimeException(e);
	}
   }
}
