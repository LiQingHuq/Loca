package getIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Socket_receive_1 {

	public Socket_receive_1() {
		// TODO 自动生成的构造函数存根
	}
 public static void main(String[] args) throws Exception {
	 while(true){
	DatagramSocket ds=new DatagramSocket(10005);
	byte[] b=new byte[1024];
	DatagramPacket dp=new DatagramPacket(b, b.length);
	ds.receive(dp);
	String s=dp.getAddress().getHostAddress();
	int i=dp.getPort();
	String str=new String(dp.getData(), 0, dp.getLength());
	System.out.println("Ip:"+s+"端口:"+i+"内容:"+str);
	ds.close();
	 }
   }
}
