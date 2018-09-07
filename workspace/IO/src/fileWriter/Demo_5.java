package fileWriter;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_5 {

	public Demo_5() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("D:\\Demo3.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hello_world");
	bw.newLine();
	bw.write("hello_world");
	bw.flush();
	bw.close();
//	fw.close();
}
}
