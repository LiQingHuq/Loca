package overrde;

import java.util.Scanner;

public class Work {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,n;//���밴�Լ����Ծ����˴�c++����,��������
		int sum=1;//��һ����������x��n�η�
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		n=sc.nextInt();
		for(int i=0;i<n;i++){
		sum=sum*x;
		}
       System.out.println("x��n�η�Ϊ��"+sum);
	}
}
