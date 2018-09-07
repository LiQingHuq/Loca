package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket_2 {

	public Server_Socket_2() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) throws IOException, Exception {
	//服务端
	 while(true){
	 ServerSocket ss=new ServerSocket(10050);
	 //获取客户端socket流
	 Socket s=ss.accept();
	 //读取客户端信息
	 File f=new File("a2.txt");
	 if(!f.exists())
		f.createNewFile();
     InputStream ip=s.getInputStream();
     int i=0;
     byte[] b=new byte[1024];
     i=ip.read(b);
     System.out.println("ip:"+s.getInetAddress().getHostAddress());
     //写入文件
     BufferedWriter bw=new BufferedWriter(new FileWriter(f));
         bw.write(new String(b,0,b.length));     
      //返回一个给客户端
     PrintWriter os=new PrintWriter(new OutputStreamWriter( s.getOutputStream()),true);
      os.println("传入成功！".getBytes()); 
      s.close();
     ss.close();
	 }
    
	
	
}
}
