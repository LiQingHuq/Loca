package org.scetc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.ha.session.DeltaManager;

public class BaseDao {

	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/student";
	private String user="root";
	private String password="123456789";
	
	protected Connection con; 
	protected PreparedStatement pre; 
	protected ResultSet re; 
	

	public void getConnection() throws Exception {
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, password);
	}
	
	public void close() throws Exception {
		if(re!=null) { re.close();}
		if(pre!=null) {pre.close();}
		if(con!=null) {con.close();}
	}
	
}
