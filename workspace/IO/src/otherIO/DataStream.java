package otherIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public DataStream() {
		// TODO 自动生成的构造函数存根
	}
	 public static void main(String[] args) throws IOException {
		File f=new File("a1.txt");
	DataStream ds=	new DataStream();
	ds.write(f);
	ds.read(f);
	}
  public  void write(File f) throws IOException{
	  DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
	  dos.writeUTF("你好吗");
	  dos.close();
  }	
  public void read(File f) throws IOException{
	  DataInputStream dis=new DataInputStream(new FileInputStream(f));
	  String s=dis.readUTF();
	  System.out.println(s);
  }
}
