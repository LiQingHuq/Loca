package getIP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_1 {

	public Get_1() {
		// TODO 自动生成的构造函数存根
	}
  public static void main(String[] args) throws UnknownHostException {
	InetAddress ip=InetAddress.getLocalHost();
	System.out.println(ip.getHostName()+"....."+ip.getHostAddress());
			}
}
