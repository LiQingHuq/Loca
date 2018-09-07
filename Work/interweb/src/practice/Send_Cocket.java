package practice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send_Cocket {

	public Send_Cocket() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws IOException {
    	
		DatagramSocket ds=new DatagramSocket();
		BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=is.readLine())!=null);  
        {
        byte[] b = str.getBytes();        
		DatagramPacket dp=new DatagramPacket(b, b.length,InetAddress.getByName("10.127.106.196"),10007);
				ds.send(dp);
        }
				ds.close();
				
    	
    }
}

