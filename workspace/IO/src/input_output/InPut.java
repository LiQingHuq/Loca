package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InPut {

	public InPut() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) throws IOException {
	FileInputStream fs=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Start.txt");
	byte[] b=new byte[fs.available()];
	fs.read(b);
		System.out.println(new String(b));
}
}
