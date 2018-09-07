package map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
public static void main(String[] args) {
	

  HashMap<Student,String> hm=new HashMap<Student,String>();
  hm.put(new Student("123",23,"Tom"),"德阳");
  hm.put(new Student("124",21,"Jerry"),"上海");
  hm.put(new Student("125",23,"Marry"),"北京");
  hm.put(new Student("126",53,"lucky"),"甘肃");
  hm.put(new Student("127",63,"jim"),"贵阳");
/*
//  Set<Map.Entry<Student, String>> s=hm.entrySet();
//  Iterator<Map.Entry<Student, String>> it=s.iterator();
  Iterator<Map.Entry<Student, String>> it=hm.entrySet().iterator();
  while(it.hasNext()){
	  Map.Entry<Student, String> m=it.next();
	  Student stu=m.getKey();
	  String str=m.getValue();
	  System.out.println("姓名："+stu.geiName()+"电话："+stu.geiTell()+"学号："+stu.getId()+"..................."+str);
  }  
  */
  
  Iterator<Student>it=hm.keySet().iterator();
  while(it.hasNext()){
	  Student stu=it.next();
	  String str=hm.get(stu);
	  System.out.println("姓名："+stu.geiName()+"电话："+stu.geiTell()+"学号："+stu.getId()+"..................."+str);
  }
}
}
