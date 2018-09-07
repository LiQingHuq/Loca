package webServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public WebServer() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) throws Throwable {
		ServerSocket ss=new ServerSocket(9090);
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("传入服务器成功！");
     	s.close();
		ss.close();
		
		
	}
}
