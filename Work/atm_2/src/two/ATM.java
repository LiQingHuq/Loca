package two;

import java.util.Scanner;

public class ATM {
	private static int m=123456;//������������
	private static int  rmb=1200;
	private static int  dollar=1200;
	private static boolean ischeck=true;//����ȫ��ѭ����������������������
	private static boolean iszmain=true;//����ȫ��ѭ��	
	/**
	 * �û�����
	 */	
	public static int enter(String str){//����һ����������
	System.out.println(str);
	Scanner sc=new Scanner(System.in);
	return sc.nextInt();
	}
	/**
	 * �����溯������������������
	 */
	public static void fmain() {
		int chance=3;
		while (ischeck) {
			int mi_Ma=enter("�������룬�������λ���");
			if(mi_Ma==m){
				zmain();
		    }
			else{
				chance--;
				System.out.println("�㻹��"+chance+"�λ���");
			  if(chance==0)
				ischeck=false;
				System.out.println("���λ���������뵽��̨����");
		  }
	   }
	}
	/**
	 * ������
	 */
	public static void main(String[] args) {
		fmain();
	}
	/**
	 * �����溯��
	 */
	public static void zmain() {
		while(iszmain){
		System.out.println("��ӭʹ��ATM�Զ�ȡ���!!!");
		System.out.println("���������ѡ��");
		System.out.println("1����ѯ");
		System.out.println("2��ȡ��");
		System.out.println("3,�˳�");	
		int z=enter("���ѡ����");
	switch (z) {
	case 1:
		cha_Xun();
		break;

	case 2:
		qu_Kuan();
		break;
	case 3:
		iszmain=false;
		System.out.println("��ӭʹ���´��ټ�����������");
		break;
	     }
	   }		
	}
	/**
	 * ��ѯ����
	 */
	public static void cha_Xun() {
		boolean ischa_Xun=true;
		while(ischa_Xun){
		System.out.println("��ӭʹ�ò�ѯ����ѡ�����");
		System.out.println("1�������");
		System.out.println("2����Ԫ");
		int c=enter("�������ѡ�񣡣���������");
				switch (c) {
				case 1:
					System.out.println("��������Ϊ"+rmb+"");
					break;
				case 2:
					System.out.println("��Ԫ���Ϊ"+dollar+"");
					break;
				}
				ischa_Xun=go_On("��ѯ");
	  }
	}
  
	/**
	 * ȫ����ѭ���ĺ���
	 */
    public static boolean go_On(String str){
    	 boolean isgo_On=true;
    	 System.out.println("�Ƿ�������"+str+"����");
    	 System.out.println("1,����");
    	 System.out.println("2���ص�������");
    	 int go=enter("�������ѡ��");
    	 if(go==2){
    		 isgo_On=false; 
    	   }
			return isgo_On;
		 }
      

    public static void qu_Kuan(){  	
    boolean isqu_Kuan=true;
    while(isqu_Kuan){
    	System.out.println("��ӭʹ��ȡ���ѡ�����");
		System.out.println("1�������");
		System.out.println("2����Ԫ");
		int q=enter("ȡ��ѡ��");
		switch (q) {
		case 1:
			int money=enter("����ȡ���");
			if(money>=rmb){	
				System.out.println("��������������������룡");
			}
			else if(money%100!=0){
				System.out.println("������100������");
			}
			else {
				rmb-=money;
				System.out.println("��������Ϊ"+rmb+"Ԫ");
			}
			break;

         case 2:
        	 int dmoney=enter("����ȡ���");
 			if(dmoney>=rmb){	
 				System.out.println("��������������������룡");
 			}
 			else if(dmoney%100!=0){
 				System.out.println("������100������");
 			}
 			else {
 				dollar-=dmoney;
 				System.out.println("��������Ϊ"+dollar+"Ԫ");
 			}
			
			break;
		}
		isqu_Kuan=go_On("ȡ��");
    }
   }
}




