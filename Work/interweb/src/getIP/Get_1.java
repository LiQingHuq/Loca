package getIP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_1 {

	public Get_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
  public static void main(String[] args) throws UnknownHostException {
	InetAddress ip=InetAddress.getLocalHost();
	System.out.println(ip.getHostName()+"....."+ip.getHostAddress());
			}
}
