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
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args)throws IOException  {
	//�ı�������ʾ�ڿ���̨��
	//1��Դ��read inputStream Ŀ�ģ�writer outputStream
	//2�����ı�read
	//3��Դ�豸��Ӳ�̣�Ŀ���豸������̨
	//4��ת������Ч
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
