package overrde;

import java.util.Scanner;

public class Work {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,n;//输入按自己语言决定此处c++语言,定义类型
		int sum=1;//用一个数来放置x的n次方
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++){
		sum=sum*x;
		}
       System.out.println("x的n次方为："+sum);
	}
}
