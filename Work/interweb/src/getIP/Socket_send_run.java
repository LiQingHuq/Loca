package getIP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Socket_send_run implements Runnable {
	private DatagramSocket ds;
	public Socket_send_run( DatagramSocket ds) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String str=null;
		    while((str=br.readLine())!=null)
		    	if(str.equals("over"))		    			    	
		    		break;		    	
		    byte[] b=str.getBytes();
		    DatagramPacket dp=new DatagramPacket(b, b.length,InetAddress.getByName("10.127.106.196"),10006);
		    ds.send(dp);
		    ds.close();	    		    	
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
  
}
