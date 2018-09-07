package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Xiuqiu_2 {

	public Xiuqiu_2() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	//需求：从键盘输入一个信息到文件中
	//1,源：inputstream  reader 目的：outputstream,writer
	//2，纯文本 reader writer
	//3，源设备：控制台， 目的设备：硬盘
	//缓冲区 buff
	BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw=new BufferedWriter(new FileWriter("all.txt"));
	String s=null;
	while((s=dr.readLine())!=null)
	{
		if(s.equals("over"))
			break;
		bw.write(s);
		bw.newLine();
	
	}
	bw.flush();
	bw.close();
	dr.close();
}
}
