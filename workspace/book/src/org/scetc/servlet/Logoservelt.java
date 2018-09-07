package org.scetc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.scetc.dao.AdminDao;
import org.scetc.model.Admin;

public class Logoservelt extends HttpServlet {

	public Logoservelt() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		resp.getWriter().append("Served at：").append(req.getContextPath());
	}@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
	   String name=req.getParameter("name");
	   String password=req.getParameter("password");
	   AdminDao ad=new AdminDao();
	   Admin admin=ad.queryByCon(name, password);
	   PrintWriter out=resp.getWriter();
	   
	    if(admin!=null){
	    	out.print("suc");
	    }
	    else{
	    	out.print("fail");
	    }
	}



}
