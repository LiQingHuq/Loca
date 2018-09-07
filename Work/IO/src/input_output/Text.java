package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Text {

	public Text() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException,FileNotFoundException {
	BufferedReader dr=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\Start.txt")));
	//BufferedWriter dw=new BufferedWriter(new OutputStreamWriter(System.out));
	String s=null;
	while((s=dr.readLine())!=null)
	{
		if(s.equals("over"))
			break;
		System.out.println(s);
	
	}
//	dw.flush();
//	dw.close();
	dr.close();
}
}
