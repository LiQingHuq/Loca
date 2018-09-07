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
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("布鲁斯李");
		li.add("堂吉诃德");
		li.add("万维网之父");
		li.add("蒂姆");
		first(li);
		
		Map<Integer,String> mo=new HashMap<Integer,String>();
		mo.put(10, "压缩");
		mo.put(20, "劫");
		mo.put(30, "蛮王");
		mo.put(40, "梦魇");
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
		// TODO 自动生成的方法存根
		Set<?>it=mo.keySet();
		Iterator<?> it1=it.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
	}
	private static void second(Set<?> l) {
		// TODO 自动生成的方法存根
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	private static void first(List<String> li) {
		// TODO 自动生成的方法存根
		for(String s:li){
			System.out.println(s);
		}
	}
	private static void fourth(List<?> l) {
		// TODO 自动生成的方法存根
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	private static void fifth(Collection<?> l) {
		// TODO 自动生成的方法存根
		Iterator<?>it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}
