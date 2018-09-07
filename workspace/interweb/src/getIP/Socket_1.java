package getIP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Socket_1 {

	public Socket_1() {
		// TODO Auto-generated constructor stub
	}
  public static void main(String[] args) throws IOException, Exception,ConnectException {

	Socket s=new Socket("10.127.106.196", 10007);
	OutputStream is=s.getOutputStream();
			is.write("hello_world".getBytes());
			is.close();
}
}
