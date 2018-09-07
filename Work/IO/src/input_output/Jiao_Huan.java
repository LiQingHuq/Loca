package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Jiao_Huan {

	public Jiao_Huan() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	         BufferedReader bd= new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt"));
//	         BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\D.txt")));
	         BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	         String s=null;
	         while((s=bd.readLine())!=null){
	        	 bw.newLine();
	        	 bw.write(s);
	         }
	         bw.flush();
	         bw.close();
	         bd.close();
}
}
