package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mp3 {

	public Mp3() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public static void main(String[] args) throws IOException {
	coppy();
}
    public static void coppy() throws IOException{
    	FileInputStream fis=new FileInputStream("D:\\ʸҰ���� - LOVE Theme from TIGA ��M-2��.mp3");
    	FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\first.mp3");
    	byte[] b=new byte[1024];
    	int i=0;
    	while((i=fis.read(b))!=-1)
    	   fos.write(b,0,i);
    	fos.close();
    	fis.close();
    }
}
