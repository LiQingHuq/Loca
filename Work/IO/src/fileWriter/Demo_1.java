package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_1 {
	
private static final String LINE_SEPARATOR = System.getProperty("line.separator");

public static void main(String[] args) throws IOException {
	//�ڴ���Ӳ��д������
	/*�����������ļ���д���ַ����ݵ��ַ����������
	 * ��Ȼ����һ���ļ���д�����ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ�
	 * �����ڴ洢���ݵ�Ŀ�ĵأ�
	 * ����ļ������ڣ��ͻ��Զ�������
	 * ����ļ����ھͻᱻ����
	*/
	FileWriter fw=new FileWriter("demo.txt");
	
	fw.write("TimBern"+LINE_SEPARATOR+"ers-Lee��ķ����˹��,�ַ�����д��");
	fw.flush();
	fw.close();
}
}
