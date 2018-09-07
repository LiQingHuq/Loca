package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class All {

	public All() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws IOException {
		write(read());
	}
      public static byte[] read() throws IOException{
    	  
    	  FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Start.txt");
    	  byte[] b=new byte[fis.available()];
    	  fis.read(b);
		  return b;
      } 
      public static void write(byte[] b) throws IOException{
    	  FileOutputStream fos=new FileOutputStream("all.txt");
    	  fos.write(b);
    	  fos.close();
      }
}
