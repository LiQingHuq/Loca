package input_output;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SysOUt {

	public SysOUt() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	
//	InputStream is=System.in;	
//	InputStreamReader ips=new InputStreamReader(is);
//	BufferedReader bis=new BufferedReader(ips);
	BufferedReader bis=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Start.txt")));
//	OutputStream os=System.out;
//	OutputStreamWriter ow=new OutputStreamWriter(os);
//	BufferedWriter bw=new  BufferedWriter(ow);
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	String line=null;
	while((line=bis.readLine())!=null)
	{
		if(line.equals("over"))
			break;
		System.out.println(line.toUpperCase());
//		bw.write(line);
	}
	bw.close();
	bis.close();
}
}
