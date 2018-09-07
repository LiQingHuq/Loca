package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_Socket_2 {

	public Client_Socket_2() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) throws Exception {
	 //客户端对象
	
		Socket s=new Socket("10.127.106.196", 10050);
		//键盘输入
		BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os=new PrintWriter(new OutputStreamWriter( s.getOutputStream()),true);
		String str=null;
		while((str=dr.readLine())!=null)
			if(str.equals("over"))
				break;
		//获取socket流
	    os.println(str);
		//服务端获取信息
		InputStream is1=s.getInputStream();
		int i=0;
		byte[] b1=new byte[1024];
		i=is1.read(b1, 0, i);
		System.out.println(b1.toString());
	    s.close();
	
}
}
