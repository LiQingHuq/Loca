package getIP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Socket_receive_run implements Runnable{
    private DatagramSocket ds;
	public Socket_receive_run(DatagramSocket ds){
		// TODO �Զ����ɵĹ��캯�����
		this.ds=ds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while(true){			
			byte[] b=new byte[1024];
		    DatagramPacket dp=new DatagramPacket(b, b.length);
		    ds.receive(dp);
		    String ip=dp.getAddress().getHostAddress();
		    int prop=dp.getPort();
		    String str=new String(dp.getData(), 0, dp.getLength());
		    System.out.println("IP:"+ip+"�˿�:"+prop+"����"+str);
		    ds.close();
			}
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���ն˳������ˣ�");
		}
		
	    
		
	}

}
