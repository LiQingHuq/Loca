package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		//创建容器
		List list1=new ArrayList();
		//添加数据
		list1.add(1);
		list1.add(2.11);
		list1.add("sdasd");
		//遍历for
		for(int i=0;i<list1.size();i++)
			System.out.println(list1.get(i));
		//第二种
		for(Object a:list1)
			System.out.println(a);
		//第三种iterator迭代器
		Iterator iter=list1.iterator();
				while(iter.hasNext())
				{
		Object obj=iter.next();
		System.out.println(obj);
	}

	}
	}
