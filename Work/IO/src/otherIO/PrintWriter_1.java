package otherIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriter_1 {

	public PrintWriter_1() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	File f=new File("demo.txt");
	 Writer(f);
}
public static void Writer(File f) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter bw=new PrintWriter(new FileWriter(f,true));
	String s=null;
	while((s=br.readLine())!=null)
	{
		if(s.equals("over"))
			break;
		bw.println(s);
	}
	bw.close();
	br.close();
	
}
}
