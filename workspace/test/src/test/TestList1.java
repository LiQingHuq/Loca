package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		//��������
		List list1=new ArrayList();
		//�������
		list1.add(1);
		list1.add(2.11);
		list1.add("sdasd");
		//����for
		for(int i=0;i<list1.size();i++)
			System.out.println(list1.get(i));
		//�ڶ���
		for(Object a:list1)
			System.out.println(a);
		//������iterator������
		Iterator iter=list1.iterator();
				while(iter.hasNext())
				{
		Object obj=iter.next();
		System.out.println(obj);
	}

	}
	}
