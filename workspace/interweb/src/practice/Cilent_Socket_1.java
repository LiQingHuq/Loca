package practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cilent_Socket_1 {

	public Cilent_Socket_1() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) throws Exception, IOException {
	Socket s=new Socket("10.127.106.196", 10010);
	
	OutputStream os=s.getOutputStream();
	os.write("ÄãºÃ£¡".getBytes());
	os.flush();
	
	InputStream is=s.getInputStream();
	byte[] b=new byte[1024];
	int i=is.read(b);
	String str=new String(b,0,i);
	System.out.println("ok");
	
	s.close();	
	is.close();
	os.close();
}
}
