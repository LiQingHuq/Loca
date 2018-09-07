package org.conn.dao;

import java.util.ArrayList;
import java.util.List;

import org.scetc.model.Book;

public class MianDao extends TextDao{
	public List<Book> queryAll(){
		List<Book> bookList=new ArrayList<Book>();
		try {
			this.getContral();
			String sql="select * from users";
			pre=con.prepareStatement(sql);
			re=pre.executeQuery();
			while(re.next()) {
				int id=re.getInt("id");
				String account=re.getString("account");
				String password=re.getString("password");						
				bookList.add(new Book(id, account,password));
			}
			this.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("jdbc连接数据库失败！");
		}
		return bookList;
	}

}
