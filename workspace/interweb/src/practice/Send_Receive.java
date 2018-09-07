package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Send_Receive {

	public Send_Receive() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws Exception {
    	while(true){
		 DatagramSocket ds=new DatagramSocket(10007);
		 byte[] b=new byte[1024];
		 DatagramPacket dp=new DatagramPacket(b, b.length);
		 ds.receive(dp);
		 int i=dp.getPort();
		 String str=dp.getAddress().getHostAddress();		 
		 String  si=new String(dp.getData(), 0, dp.getLength());
				 System.out.println("ip"+str+"\t¶Ë¿Ú"+str+"\tÄÚÈÝ:"+si);
    	}
    	
	}
}
