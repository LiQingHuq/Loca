package getIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Socket_send {

	public Socket_send() {
		// TODO 自动生成的构造函数存根
	}
 public static void main(String[] args) throws SocketException, IOException {
	//建立发送端 
	 System.out.println("发送端。。。。。。。");
	 DatagramSocket ds=new DatagramSocket();
	 String str="udp来了，请注意接收！";
	 byte[] b=str.getBytes();
	 DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getByName("192.168.253.1"),10000);
	 ds.send(dp);
	 ds.close();
}
}
