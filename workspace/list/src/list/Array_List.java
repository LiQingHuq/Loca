package list;

import java.util.Set;
import java.util.TreeSet;

public class Array_List {

	public Array_List() {
		// TODO �Զ����ɵĹ��캯�����
	}

	
	public static void main(String[] args) {
		Set<Persion>lp=new TreeSet<Persion>(new Compertor());
		lp.add(new Persion("zom", 19));
		lp.add(new Persion("jack", 14));
		lp.add(new Persion("sum", 17));		
		lp.add(new Persion("tim", 10));
		lp.add(new Persion("jerry", 29));
	for(Persion p:lp){
	String s=p.getName();
	int i=p.getAge();
	System.out.println("����:"+s+",����:"+i);
	}
	}
}
