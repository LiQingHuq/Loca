package zhuanhuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public ArrayToList() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		String[] i={"desire","convaction"};
		List<String>li=Arrays.asList(i);
		System.out.println(li);
		
		List<String>l=new ArrayList<String>();
		l.add("invasion");
		l.add("sensitive");
		l.add("indepdent");
		l.add("substance");
		l.add("raw");
		l.add("meanwhile");
		String []s=l.toArray(new String[l.size()]);
		System.out.println(Arrays.toString(s));
	}

}
