package fileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo_2 {

	public Demo_2() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("D:\\Demo1.txt");
	FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt");
		//��һ��дһ��
		int i=0;
		while((i=fr.read())!=-1)
		    fw.write(i);
		
		fw.flush();
		fr.close();
		fw.close();
	
  }
}
