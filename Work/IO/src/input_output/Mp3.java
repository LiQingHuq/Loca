package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mp3 {

	public Mp3() {
		// TODO 自动生成的构造函数存根
	}
    public static void main(String[] args) throws IOException {
	coppy();
}
    public static void coppy() throws IOException{
    	FileInputStream fis=new FileInputStream("D:\\矢野立美 - LOVE Theme from TIGA ＜M-2＞.mp3");
    	FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.mp3");
    	byte[] b=new byte[1024];
    	int i=0;
    	while((i=fis.read(b))!=-1)
    	   fos.write(b,0,i);
    	fos.close();
    	fis.close();
    }
}
