package org.scetc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.scetc.dao.BookDao;
import org.scetc.model.Book;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class BookList
 */
@WebServlet("/bookList")
public class BookList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.查询数据库
		BookDao bd=new BookDao();
		List<Book> bookList=bd.queryAll();
		//2.封装成JSON格式【完美的字符串表现格式】
		//把一个Java的集合转换成Json的数组格式
		JSONArray ja=JSONArray.fromObject(bookList);
		//3.直接通过响应对象输出
		//首先设置输出格式编码，避免出现中文乱码
		response.setContentType("text/html;charset=utf-8");
		//获取输出对象
		PrintWriter out=response.getWriter();
		//直接输出
		out.print(ja.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
