package paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class First {

	public First() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
	
		demo();
		
	}
	private static void demo() {
		// TODO �Զ����ɵķ������
		List<String> ls=new ArrayList<String>();

		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		ls.add("five");
		ls.add("six");
		System.out.println(ls); 
		
		Collections.sort(ls);
		System.out.println(ls);
		Collections.replaceAll(ls, "one", "jack");
         System.out.println(ls);
	}
}
