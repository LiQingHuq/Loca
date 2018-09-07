package getIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Socket_receive {

	public Socket_receive() {
		// TODO 自动生成的构造函数存根
	}
    public static void main(String[] args) throws Exception {
    	System.out.println("接收端。。。。。。。");
		DatagramSocket ds=new DatagramSocket(10000);
		byte[] b=new byte[1024];
	    DatagramPacket dp=new DatagramPacket(b, b.length);
	   
	    ds.receive(dp);
	    String ip=dp.getAddress().getHostAddress();
	    int port=dp.getPort();
	    String str=new String(dp.getData(),0,dp.getLength());
	    System.out.println(ip+port+str);
    }
}
