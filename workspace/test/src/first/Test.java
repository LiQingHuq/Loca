package first;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入第1个数字");
		int max=sc.nextInt();
          int i=2;
          for(;i<=5;i++){
        	  System.out.println("请输入第"+i+"个数字");
        	  int bb=sc.nextInt();
        	  if(bb>max){
        		  max=bb;}  
	}
System.out.println("输入最大数："+max);
}
}