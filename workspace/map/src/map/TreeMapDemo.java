package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public TreeMapDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		 TreeMap<Student,String> hm=new TreeMap<Student,String>(new ComparatorByName());
		  hm.put(new Student("123",23,"Tom"),"����");
		  hm.put(new Student("124",21,"Jerry"),"�Ϻ�");
		  hm.put(new Student("125",23,"Marry"),"����");
		  hm.put(new Student("126",53,"lucky"),"����");
		  hm.put(new Student("127",63,"jim"),"����");

//		 Set<Map.Entry<Student, String>> s=hm.entrySet();
//	  Iterator<Map.Entry<Student, String>> it=s.iterator();
		  Iterator<Map.Entry<Student, String>> it=hm.entrySet().iterator();
	//	  Iterator<Student>it=hm.keySet().iterator();
		  while(it.hasNext()){
			  Map.Entry<Student, String> m=it.next();
			  Student stu=m.getKey();
			  String str=m.getValue();
//			  Student stu=it.next();
//			  String  str=hm.get(stu);
			  System.out.println("������"+stu.geiName()+"  �绰��"+stu.geiTell()+"  ѧ�ţ�"+stu.getId()+"..................."+str);
		  }  
	}
}
