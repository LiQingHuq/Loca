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
		System.out.println("����Ҫ���n�㣡");
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
