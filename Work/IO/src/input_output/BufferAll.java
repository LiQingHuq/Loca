package input_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferAll {

	public BufferAll() {
		// TODO 自动生成的构造函数存根
	}
	   public static void main(String[] args) throws IOException {
			coppy();
			coppy1();
		}
		    public static void coppy() throws IOException{
		    	FileInputStream fis=new FileInputStream("D:\\矢野立美 - LOVE Theme from TIGA ＜M-2＞.mp3");
		    	BufferedInputStream bis=new BufferedInputStream(fis);
		    	FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.mp3");
		    	BufferedOutputStream bos=new BufferedOutputStream(fos);
		    	byte[] b=new byte[1024];
		    	int i=0;
		    	while((i=bis.read(b))!=-1)
		    	   bos.write(b,0,i);
		    	bos.flush();
		    	bis.close();
		    	bos.close();
		    }
		    
		    public static void coppy1() throws IOException{
		    	FileInputStream fis=new FileInputStream("D:\\矢野立美 - LOVE Theme from TIGA ＜M-2＞.mp3");
		    	BufferedInputStream bis=new BufferedInputStream(fis);
		    	FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\two.mp3");
		    	BufferedOutputStream bos=new BufferedOutputStream(fos);
		    	byte[] b=new byte[fis.available()];
		           bis.read(b);
		           bos.write(b);
		    	bos.flush();
		    	bis.close();
		    	bos.close();
		    }
}
