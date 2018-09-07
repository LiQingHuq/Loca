package junit.text;

import org.junit.Test;

import cn.itcast.domain.Students;
import cn.itcast.studentdao.StudentDao;



public class Text {
	
	@Test
	public void textAdd1(){
		StudentDao ss=new StudentDao();
		Students s=new Students();
		s.setExamid("123");
		s.setGrade("66");
		s.setIdcard("963");
		s.setLocation("北京");
	    s.setName("李华");
	    ss.add(s);
	}
	
	
	@Test
public void textAdd(){
	StudentDao ss=new StudentDao();
	Students s=new Students();
	s.setExamid("123456");
	s.setGrade("50");
	s.setIdcard("111");
	s.setLocation("北京");
    s.setName("李青华");
    ss.add(s);
}
	@Test
	public void textfind(){
		StudentDao ss=new StudentDao();
     	ss.find("222");
	}
		
	@Test
	public void textDelete(){
		StudentDao ss=new StudentDao();
		ss.delete("张三");
	}
}
