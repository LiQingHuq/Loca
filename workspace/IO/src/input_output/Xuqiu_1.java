package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Xuqiu_1 {

	public Xuqiu_1() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	//源：Start ，目的：控制台
	//纯文本数据
	//源：内存 ，目的设备：控制台
	//需要额外缓冲区
	BufferedReader dr=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt"));
	BufferedWriter dw=new BufferedWriter(new OutputStreamWriter(System.out));
	String s=null;
	while((s=dr.readLine())!=null){
		dw.write(s);
		dw.newLine();
	}
	dw.flush();
	dw.close();
	dr.close();
}
}
