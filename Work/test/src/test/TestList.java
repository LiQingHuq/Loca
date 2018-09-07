package test;

import java.util.List;

import javax.swing.Spring;

import java.util.ArrayList;;

public class TestList {
public static void main(String[] args) {
	//创建容器
	List<Comparable> list1=new ArrayList<Comparable>();
	//添加数据
	list1.add(1);
	list1.add(2.11);
	list1.add("sdasd");
	//获取数据
	int ab=(int)list1.get(0);
	String ac=(String) list1.get(2);
	System.out.println(ab+"；"+ac);
	//长度
	int size=list1.size();
	System.out.println("size:"+size);
	//移除
	list1.remove(1);
	int size1=list1.size();
	System.out.println(list1.get(1));
	System.out.println("新的size:"+size1);
	
}
}
