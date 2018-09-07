package getIP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Socket_send_1 {

	public Socket_send_1() {
		// TODO 自动生成的构造函数存根
	}
	 public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		BufferedReader is=new  BufferedReader(new InputStreamReader(System.in));
		String s=null;
		while((s=is.readLine())!=null)
		{
			if(s.equals("over"))
				break;
			
			byte[] b=s.getBytes();
			DatagramPacket dp=new DatagramPacket(b, b.length, InetAddress.getByName("10.127.106.196"), 10005);
			ds.send(dp);
		
		}
		ds.close();
			
			
	}

}
