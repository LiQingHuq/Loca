package getRun;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SendRun implements Runnable{
   private DatagramSocket ds;
	public SendRun(DatagramSocket ds) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
	}

	@Override
	public void run() {	   
	try {
		while(true){
//		System.out.println("接收端来了");
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		ds.receive(dp);
		int i=dp.getPort();
		String str=dp.getAddress().getHostAddress();
		String sr=new String(dp.getData(), 0, dp.getLength());
		System.out.println("端口："+i+"IP："+str+"内容"+sr);		
	  }
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
