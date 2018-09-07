package org.scetc.dao;

import org.scetc.model.Admin;

public class AdminDao extends BaseDao{

	public AdminDao() {
		// TODO 自动生成的构造函数存根
	}  
	public Admin queryByCon(String name,String password){
		Admin admin=null;
		try{
			this.getConnection();
			String sql="select *from account where name=? and password=?";;
		    pre=con.prepareStatement(sql);
		    pre.setString(1, name);
		    pre.setString(2,password);
		    if(re.next())
		    {
		    	admin=new Admin(name,password);
		    }
		  this.close();
		}
		catch(Exception e)
		{
			
		}
		return admin;
	}

}
