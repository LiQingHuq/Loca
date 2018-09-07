package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPut {

	public OutPut() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
FileOutputStream fp=new FileOutputStream("wenben.txt");
fp.write("hello_world".getBytes());
fp.close();
}
}
