package list;

import java.util.ArrayList;
import java.util.List;

public class First {

	public First() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		List<Student>l1=new ArrayList<Student>();
		l1.add(new Student("���",23));
		l1.add(new Student("hello",21));
		
		List<Persion>l2=new ArrayList<Persion>();
		l2.add(new Persion("�����",23));
		l2.add(new Persion("hwllo_wall",21));
		
		//List<Worker>l3=new ArrayList<Worker>();
		
		System.out.println(l1.size());
	}

}
