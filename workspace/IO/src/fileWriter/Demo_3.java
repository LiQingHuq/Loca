package fileWriter;

import java.io.FileReader;
import java.io.IOException;

public class Demo_3 {

	public Demo_3() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	FileReader fd=null;
	try{
		
		fd=new FileReader ("C:\\Users\\Administrator\\Desktop\\Start.txt");
	   StringBuffer str=new StringBuffer();
	   int i=0;
	   while((i=fd.read())!=-1){	
		      str.append((char)i);
		 System.out.println(str);
		   
	   }
		   
	       
	}
	catch(Exception e){
		System.out.println("读取错误！");
	}
	   try {
		fd.close();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}
}
