package otherIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Array {

	public Array() {
		// TODO 自动生成的构造函数存根
	}
  public static void main(String[] args) {
	  ByteArrayOutputStream bos=new ByteArrayOutputStream();
	ByteArrayInputStream bis=new ByteArrayInputStream("清华".getBytes());
	int i=0;
	while((i=bis.read())!=-1)
		System.out.println(i);
}
}
