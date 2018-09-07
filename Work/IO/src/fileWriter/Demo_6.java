package fileWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo_6 {

	public Demo_6() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt");
	BufferedReader db=new BufferedReader(fr);	
   String s=new String();
    while((s=db.readLine())!=null)
       System.out.println(s); 
   
   
//   char[] c=new char[1024];
//   int i=1;
//   while((i=db.read(c))!=-1)//在缓冲区读取数据
//	   System.out.println(c);
   }
}
