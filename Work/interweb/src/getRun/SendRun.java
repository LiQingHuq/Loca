package getRun;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SendRun implements Runnable{
   private DatagramSocket ds;
	public SendRun(DatagramSocket ds) {
		// TODO �Զ����ɵĹ��캯�����
		this.ds=ds;
	}

	@Override
	public void run() {	   
	try {
		while(true){
//		System.out.println("���ն�����");
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		ds.receive(dp);
		int i=dp.getPort();
		String str=dp.getAddress().getHostAddress();
		String sr=new String(dp.getData(), 0, dp.getLength());
		System.out.println("�˿ڣ�"+i+"IP��"+str+"����"+sr);		
	  }
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
