package file;

import java.io.File;
import java.text.DateFormat;

public class File_1 {

	public File_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		 File f=new File("all.txt");
		 String s=f.getAbsolutePath();
		  System.out.println("·��Ϊ:"+s);
		  long l=f.length();
		  System.out.println("����Ϊ:"+l);
		  String name=f.getName();
		  System.out.println("name:"+name);
		  long tiome=f.lastModified();
		  DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	      String st=df.format(tiome);
	      System.out.println("����޸�ʱ��"+st);
	}

}
