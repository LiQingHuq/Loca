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
//		// TODO �Զ����ɵĹ��캯�����
//	}	

	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/student";
	private String user="root";
	private String password="123456789";
	
	protected Connection con; 
	
	public void getContral() throws ClassNotFoundException, SQLException{
		//ʵ�л�������
		try{
		Class.forName(driver);//������������
		 con=DriverManager.getConnection(url,user,password);//�������ݿ�
				System.out.print("�����������������ѽ������");}
		catch(Exception e){
			System.out.println("���ӳ���");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		First b=new First();
			b.getContral();
		
	}
	}