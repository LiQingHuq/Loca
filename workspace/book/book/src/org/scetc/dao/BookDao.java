package org.scetc.dao;

import java.util.ArrayList;
import java.util.List;

import org.scetc.model.Book;

public class BookDao extends BaseDao{
	
	public List<Book> queryAll(){
		List<Book> bookList=new ArrayList<Book>();
		try {
			this.getConnection();
			String sql="select * from book";
			pre=con.prepareStatement(sql);
			re=pre.executeQuery();
			while(re.next()) {
				int id=re.getInt("id");
				String name=re.getString("name");
				String publish=re.getString("publish");
				float price=re.getFloat("price");
				String pic=re.getString("pic");
				Book book=new Book(id, name, publish, price, pic);
				bookList.add(book);
			}
			this.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookList;
	}

}
