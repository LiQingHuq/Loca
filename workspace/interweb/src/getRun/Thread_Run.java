package getRun;

import java.io.IOException;
import java.net.DatagramSocket;

public class Thread_Run {

	public Thread_Run() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws IOException, Throwable {
		DatagramSocket send=new DatagramSocket();
		DatagramSocket receive=new DatagramSocket(20005);
	    new Thread(new ReceRun(send)).start();
	
		new Thread(new SendRun(receive)).start();
	
	
	}

}
