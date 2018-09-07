package test;

public class ArrayList {
public static void main(String[] args) {
	//第一种定义
	int [] arr1=new int[4];
	arr1[0]=0;
	arr1[1]=1;
	arr1[2]=2;
	arr1[3]=3;
	System.out.println(arr1[2]);
	//第二种定义
	String arr2[]=new String[]{"a","b","c"};
	arr2[2]=null;
	System.out.println(arr2[2]);
	//第三种遍历
	for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
	
	
  }

}
