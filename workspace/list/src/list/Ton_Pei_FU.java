package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ton_Pei_FU {

	public Ton_Pei_FU() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("��³˹��");
		li.add("�ü�ڭ��");
		li.add("��ά��֮��");
		li.add("��ķ");
		first(li);
		
		Map<Integer,String> mo=new HashMap<Integer,String>();
		mo.put(10, "ѹ��");
		mo.put(20, "��");
		mo.put(30, "����");
		mo.put(40, "����");
		third(mo);
		
		Set<Integer>l=new HashSet<Integer>();
		l.add(1);
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		second(l);
		
		List<Student>ls=new ArrayList<Student>();
		ls.add(new Student("TomCat", 22));
		ls.add(new Student("Apache", 23));
		ls.add(new Student("JeckChen", 11));
		ls.add(new Student("Absore", 31));
		fourth(ls);
		
		
		Collection<String>ss=new ArrayList<String>();
		ss.add("boy");
		ss.add("girl");
		fifth(ss);
		
	}
			
	

	private static void third(Map<?, ?> mo) {
		// TODO �Զ����ɵķ������
		Set<?>it=mo.keySet();
		Iterator<?> it1=it.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	}
	private static void second(Set<?> l) {
		// TODO �Զ����ɵķ������
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	private static void first(List<String> li) {
		// TODO �Զ����ɵķ������
		for(String s:li){
			System.out.println(s);
		}
	}
	private static void fourth(List<?> l) {
		// TODO �Զ����ɵķ������
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	private static void fifth(Collection<?> l) {
		// TODO �Զ����ɵķ������
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}
