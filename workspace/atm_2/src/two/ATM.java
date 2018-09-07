package two;

import java.util.Scanner;

public class ATM {
	private static int m=123456;//密码声明类型
	private static int  rmb=1200;
	private static int  dollar=1200;
	private static boolean ischeck=true;//用于全局循环布尔变量本来就是类型
	private static boolean iszmain=true;//用于全局循环	
	/**
	 * 用户输入
	 */	
	public static int enter(String str){//输入一个参数带入
	System.out.println(str);
	Scanner sc=new Scanner(System.in);
	return sc.nextInt();
	}
	/**
	 * 主界面函数进入的输入密码界面
	 */
	public static void fmain() {
		int chance=3;
		while (ischeck) {
			int mi_Ma=enter("输入密码，你有三次机会");
			if(mi_Ma==m){
				zmain();
		    }
			else{
				chance--;
				System.out.println("你还有"+chance+"次机会");
			  if(chance==0)
				ischeck=false;
				System.out.println("三次机会用完后，请到柜台办理！");
		  }
	   }
	}
	/**
	 * 主函数
	 */
	public static void main(String[] args) {
		fmain();
	}
	/**
	 * 主界面函数
	 */
	public static void zmain() {
		while(iszmain){
		System.out.println("欢迎使用ATM自动取款机!!!");
		System.out.println("请输入你的选择！");
		System.out.println("1，查询");
		System.out.println("2，取款");
		System.out.println("3,退出");	
		int z=enter("你的选择是");
	switch (z) {
	case 1:
		cha_Xun();
		break;

	case 2:
		qu_Kuan();
		break;
	case 3:
		iszmain=false;
		System.out.println("欢迎使用下次再见！！！！！");
		break;
	     }
	   }		
	}
	/**
	 * 查询函数
	 */
	public static void cha_Xun() {
		boolean ischa_Xun=true;
		while(ischa_Xun){
		System.out.println("欢迎使用查询！请选择币种");
		System.out.println("1，人民币");
		System.out.println("2，美元");
		int c=enter("输入你的选择！！！！！！");
				switch (c) {
				case 1:
					System.out.println("人民币余额为"+rmb+"");
					break;
				case 2:
					System.out.println("美元余额为"+dollar+"");
					break;
				}
				ischa_Xun=go_On("查询");
	  }
	}
  
	/**
	 * 全用于循环的函数
	 */
    public static boolean go_On(String str){
    	 boolean isgo_On=true;
    	 System.out.println("是否继续你的"+str+"操作");
    	 System.out.println("1,继续");
    	 System.out.println("2，回到主界面");
    	 int go=enter("输入你的选择！");
    	 if(go==2){
    		 isgo_On=false; 
    	   }
			return isgo_On;
		 }
      

    public static void qu_Kuan(){  	
    boolean isqu_Kuan=true;
    while(isqu_Kuan){
    	System.out.println("欢迎使用取款！请选择币种");
		System.out.println("1，人民币");
		System.out.println("2，美元");
		int q=enter("取款选择");
		switch (q) {
		case 1:
			int money=enter("输入取款金额！");
			if(money>=rmb){	
				System.out.println("输入金额大于余额，请重新输入！");
			}
			else if(money%100!=0){
				System.out.println("请输入100的整数");
			}
			else {
				rmb-=money;
				System.out.println("人民币余额为"+rmb+"元");
			}
			break;

         case 2:
        	 int dmoney=enter("输入取款金额！");
 			if(dmoney>=rmb){	
 				System.out.println("输入金额大于余额，请重新输入！");
 			}
 			else if(dmoney%100!=0){
 				System.out.println("请输入100的整数");
 			}
 			else {
 				dollar-=dmoney;
 				System.out.println("人民币余额为"+dollar+"元");
 			}
			
			break;
		}
		isqu_Kuan=go_On("取款");
    }
   }
}




