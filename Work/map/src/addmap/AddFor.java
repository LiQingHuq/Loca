package addmap;

import java.util.HashMap;
import java.util.Map;

import map.Student;

public class AddFor {

	public AddFor() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	 HashMap<Student,String> hm=new HashMap<Student,String>();
	  hm.put(new Student("123",23,"Tom"),"����");
	  hm.put(new Student("124",21,"Jerry"),"�Ϻ�");
	  hm.put(new Student("125",23,"Marry"),"����");
	  hm.put(new Student("126",53,"lucky"),"����");
	  hm.put(new Student("127",63,"jim"),"����");
	  for(Object obj:hm.keySet()){
		  Student stu=(Student) obj;
		  String str=hm.get(stu);
		  System.out.println("������"+stu.geiName()+"�绰��"+stu.geiTell()+"ѧ�ţ�"+stu.getId()+"..................."+str);
	  }
	  for(Map.Entry<Student,String> s:hm.entrySet()){
		  Student su=s.getKey();
		  String st=s.getValue();
		  System.out.println("������"+su.geiName()+"�绰��"+su.geiTell()+"ѧ�ţ�"+su.getId()+"..................."+st);
	  }
}
}
