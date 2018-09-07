package javase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class basic {

//new Runnable() {
//	public void run() {
//			public basic() {
//		// TODO 自动生成的构造函数存根
//	}
//	
	private String driver="com.mysql.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/student"; 
	private String user="root";
	private String password="123456789";
	protected Connection con;
	public void getContral() throws ClassNotFoundException, SQLException{
		//实列化工具栏
		Class.forName(driver);
		con=DriverManager.getConnection(url,user,password);
				System.out.print("son suc!");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		basic b=new basic();
			b.getContral();
		
	}
	}
//}
		
//	for(int x=0;x<5;x++){
//	for(int y=0;y<=5;y++){
//		System.out.print("*");
//	}
//	System.out.println();
//	}
		
		
		
//		for(int x=5;x>0;x--){
//			for(int y=0;y<x;y++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//		

//
//		for(int x=1;x<5;x++){
//		for(int y=5;y>x;y--){
//			System.out.print(y);
//		}
//		System.out.println();
//		}
//		
		
//		for(int x=1;x<=5;x++){
//			for(int y=1;y<=x;y++){
//				System.out.print(x);
//			}
//			System.out.println();
//			}
//			
//		
//		
//		for(int x=1;x<10;x++){
//			for(int y=1;y<=x;y++){
//				System.out.print(y+"*"+x+"="+(x*y)+"\t");//制表符
//			}
//			System.out.println();
//			}
		
//		for(int x=1;x<=5;x++)
//		{
//			
//		  for(int y=1;y<x;y++)
//		  {
//			System.out.print(" ");
//		   }
//		   for(int z=x;z<=5;z++)
//		   {
//			System.out.print("* ");
//	    	}
//		 System.out.println();
//		}
			
//		
//		for(int x=1;x<=5;x++)
//		{
//		for(int y=5;y>0;y--)
//		{
//			if(x>=y){
//				System.out.print("*");			
//				}
//			
//			else{
//				System.out.print(" ");
//			}
//				
//		}
//					
//		System.out.println();
//		}
//		System.out.println("\"welcome!\"");
//		System.out.println("a/b=C");
//		System.out.println("\\\\do something");
//				
     
	//}
