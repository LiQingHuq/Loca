package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Xuqiu_1 {

	public Xuqiu_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) throws IOException {
	//Դ��Start ��Ŀ�ģ�����̨
	//���ı�����
	//Դ���ڴ� ��Ŀ���豸������̨
	//��Ҫ���⻺����
	BufferedReader dr=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Start.txt"));
	BufferedWriter dw=new BufferedWriter(new OutputStreamWriter(System.out));
	String s=null;
	while((s=dr.readLine())!=null){
		dw.write(s);
		dw.newLine();
	}
	dw.flush();
	dw.close();
	dr.close();
}
}
