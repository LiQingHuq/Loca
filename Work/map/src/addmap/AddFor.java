package addmap;

import java.util.HashMap;
import java.util.Map;

import map.Student;

public class AddFor {

	public AddFor() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	 HashMap<Student,String> hm=new HashMap<Student,String>();
	  hm.put(new Student("123",23,"Tom"),"德阳");
	  hm.put(new Student("124",21,"Jerry"),"上海");
	  hm.put(new Student("125",23,"Marry"),"北京");
	  hm.put(new Student("126",53,"lucky"),"甘肃");
	  hm.put(new Student("127",63,"jim"),"贵阳");
	  for(Object obj:hm.keySet()){
		  Student stu=(Student) obj;
		  String str=hm.get(stu);
		  System.out.println("姓名："+stu.geiName()+"电话："+stu.geiTell()+"学号："+stu.getId()+"..................."+str);
	  }
	  for(Map.Entry<Student,String> s:hm.entrySet()){
		  Student su=s.getKey();
		  String st=s.getValue();
		  System.out.println("姓名："+su.geiName()+"电话："+su.geiTell()+"学号："+su.getId()+"..................."+st);
	  }
}
}
