package practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket_1 {

	public Server_Socket_1() {
		// TODO Auto-generated constructor stub
	}
       public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10010);
		Socket s=ss.accept();
		
		InputStream is=s.getInputStream();
		byte[] b=new byte[1024];
		int i=0;
		i=is.read(b);			
        String si = new String(b,0, i);
        System.out.println("read:"+si+"pore:"+s.getPort()+"Ip:"+s.getInetAddress().getHostAddress());
		
        OutputStream os=s.getOutputStream();
        os.write("accept!".getBytes());
        os.close();
        ss.close();
	}
}
