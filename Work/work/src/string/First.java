package string;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class First {

//new Runnable() {
//	public void run() {
//			public basic() {
//		// TODO 自动生成的构造函数存根
//	}	

	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/student";
	private String user="root";
	private String password="123456789";
	
	protected Connection con; 
	
	public void getContral() throws ClassNotFoundException, SQLException{
		//实列化工具栏
		try{
		Class.forName(driver);//加载驱动程序
		 con=DriverManager.getConnection(url,user,password);//连接数据库
				System.out.print("大哥我求你了跑起来呀！！！");}
		catch(Exception e){
			System.out.println("连接出错");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		First b=new First();
			b.getContral();
		
	}
	}