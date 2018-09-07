package view_study;

import java.util.ArrayList;
import java.util.Iterator;

public class Work {
		
	public static void main(String[] args) {
		ArrayList<Array> al=new ArrayList<Array>();
		al.add(new Array("jack",12));
		al.add(new Array("tom",12));
		al.add(new Array("marry",12));
		al.add(new Array("sum ",12));
		al.add(new Array("nick",12));
		Iterator<Array> it=al.iterator();
		while(it.hasNext()){
	//		System.out.println(((Array)it.next()).getName()+"Ñ§ºÅÎª:"+((Array)it.next()).getNum());
			Array a=(Array) it.next();
			System.out.println(a.getName()+"---"+a.getNum());
		}
	}

}
