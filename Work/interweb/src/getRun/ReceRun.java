package getRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReceRun implements Runnable{
    private DatagramSocket ds;
	public ReceRun(DatagramSocket ds) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
	}

	@Override
	public void run() {	
	
		try {
			System.out.println("发送端来了");
		  BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
		   String s=null;	
		   while((s=is.readLine())!=null)   {			 		  	  
		    byte[] b=s.getBytes();		   
			DatagramPacket dp = new DatagramPacket(b, b.length,InetAddress.getByName("10.127.106.196"),20005);
			ds.send(dp);
			if(s.equals("over"))
				break;
		   }
			ds.close();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    ds.close();
		
	}

}
