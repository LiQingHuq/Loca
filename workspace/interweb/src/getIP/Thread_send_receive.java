package getIP;

import java.io.IOException;
import java.net.DatagramSocket;

public class Thread_send_receive{

public static void main(String[] args) throws IOException {
     DatagramSocket send=new DatagramSocket();
     DatagramSocket receive=new DatagramSocket(10006);
	 new Thread(new Socket_receive_run(receive)).start();
     new Thread(new Socket_send_run(send)).start();
}
}
