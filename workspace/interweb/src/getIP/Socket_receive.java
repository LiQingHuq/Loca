package getIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Socket_receive {

	public Socket_receive() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public static void main(String[] args) throws Exception {
    	System.out.println("���նˡ�������������");
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
