package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Xuqiu_3 {

	public Xuqiu_3() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args)throws IOException  {
	//文本数据显示在控制台上
	//1，源：read inputStream 目的：writer outputStream
	//2，纯文本read
	//3，源设备：硬盘，目的设备：控制台
	//4，转换，高效
	BufferedReader dr=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt"));
	BufferedWriter dw=new BufferedWriter(new OutputStreamWriter(System.out));
	String s=null;
	while((s=dr.readLine())!=null)
	{
		if(s.equals("over"))
			break;
		dw.write(s);
		dw.newLine();
	
	}
	dw.flush();
	dw.close();
	dr.close();
}
}
