package getIP;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket_2 {

	public Server_Socket_2() {
		// TODO Auto-generated constructor stub
	}
  public static void main(String[] args) throws IOException {
	ServerSocket ss=new ServerSocket(10004);
	Socket s=ss.accept();
	InputStream bis=s.getInputStream();
	byte[] b=new byte[1024];
	int i=0;
    i=bis.read(b);
		String si=new String(b, 0, i);
	System.out.println("read:"+si+"pore:"+s.getPort()+"Ip:"+s.getInetAddress().getHostAddress());
  s.close();
  s.close();
  }
  
}
