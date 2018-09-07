package org.conn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TextDao {

	public TextDao() {
		// TODO 自动生成的构造函数存根
	}
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/student";
	private String user="root";
	private String password="123456789";
	
	protected Connection con; 
	protected PreparedStatement pre; 
	protected ResultSet re; 
	
	public void getContral() throws ClassNotFoundException, SQLException{
		//实列化工具栏
		
		Class.forName(driver);//加载驱动程序
		 con=DriverManager.getConnection(url,user,password);//连接数据库
			
	}
	public void close() throws Exception {
		if(re!=null) { re.close();}
		if(pre!=null) {pre.close();}
		if(con!=null) {con.close();}
	}
}
