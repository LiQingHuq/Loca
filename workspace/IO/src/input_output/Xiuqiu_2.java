package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Xiuqiu_2 {

	public Xiuqiu_2() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) throws IOException {
	//���󣺴Ӽ�������һ����Ϣ���ļ���
	//1,Դ��inputstream  reader Ŀ�ģ�outputstream,writer
	//2�����ı� reader writer
	//3��Դ�豸������̨�� Ŀ���豸��Ӳ��
	//������ buff
	BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw=new BufferedWriter(new FileWriter("all.txt"));
	String s=null;
	while((s=dr.readLine())!=null)
	{
		if(s.equals("over"))
			break;
		bw.write(s);
		bw.newLine();
	
	}
	bw.flush();
	bw.close();
	dr.close();
}
}
