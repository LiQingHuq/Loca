package it.cast.n;

import java.util.Scanner;

import org.junit.Test;

public class N {

	public N() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	}
	
	@Test
	public void text(){
		System.out.println("输入要求的n层！");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){			
			for(int y=1;y<=n-i;y++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
