package fileWriter;

import java.io.FileReader;
import java.io.IOException;

public class Demo_3 {

	public Demo_3() {
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println("��ȡ����");
	}
	   try {
		fd.close();
	} catch (IOException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
}
}
