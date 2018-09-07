package getIP;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket_1 {

	public Server_Socket_1() {
		// TODO Auto-generated constructor stub
	}
   public static void main(String[] args) throws Exception {
	 ServerSocket ss=new ServerSocket(10007);
	 Socket s=ss.accept();
	 InputStream is=s.getInputStream();
	 int si=0;
	 byte []b=new byte[1024];
	 String str=s.getInetAddress().getHostAddress();
	 int p=s.getPort();
	 si=is.read(b);
		 String st=new String(b,0,si);	
	 System.out.println("Server:"+st+"IP"+str+"prop:"+p);
	 s.close();
	 ss.close();
}
}
