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
		// TODO �Զ����ɵĹ��캯�����
	}
 public static void main(String[] args) throws SocketException, IOException {
	//�������Ͷ� 
	 System.out.println("���Ͷˡ�������������");
	 DatagramSocket ds=new DatagramSocket();
	 String str="udp���ˣ���ע����գ�";
	 byte[] b=str.getBytes();
	 DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getByName("192.168.253.1"),10000);
	 ds.send(dp);
	 ds.close();
}
}
