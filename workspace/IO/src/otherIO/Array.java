package otherIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Array {

	public Array() {
		// TODO �Զ����ɵĹ��캯�����
	}
  public static void main(String[] args) {
	  ByteArrayOutputStream bos=new ByteArrayOutputStream();
	ByteArrayInputStream bis=new ByteArrayInputStream("�廪".getBytes());
	int i=0;
	while((i=bis.read())!=-1)
		System.out.println(i);
}
}
