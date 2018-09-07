package fileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_4 {

	public Demo_4() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\Demo2.txt");
		FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt");
	try{
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String sb=new String();
		while((sb=br.readLine())!=null){
			bw.write(sb);
			bw.newLine();
		}		
					
//		int i=1;
//		while((i=br.read())!=-1)
//			bw.write(i);
		
		
//		char[] b=new char[1024];
//		int l=0;
//		while((l=br.read(b))!=-1)
//			bw.write(b, 0, l);
		bw.flush();
  fr.close();
       fw.close();
	}
	catch(Exception e){
		
	}
	}
}
