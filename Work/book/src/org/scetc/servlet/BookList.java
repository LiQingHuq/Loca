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
		//BookDao newһ������
		BookDao bd=new BookDao();
		//��������װ��ѯ����������
		List<Book> bookList=bd.queryAll();
		//������ת����json��ʽ
		JSONArray ja=JSONArray.fromObject(bookList);
		//���ַ�ʽ
		response.setContentType("text/html;charset=utf-8");
		//д��text.html��
		PrintWriter out=response.getWriter();
	   
		out.println(ja.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
