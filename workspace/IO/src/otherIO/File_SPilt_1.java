package otherIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

public class File_SPilt_1 {

	private static final int size = 1024*1024*10;
	public File_SPilt_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
   public static void main(String[] args) throws IOException {
	   File f=new File("C:\\Users\\Administrator\\Desktop\\a.mp3");
	split(f);
    }
   
  public static void  split(File f) throws IOException{
	  BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
	  //����ÿһ��Ŀ���ļ��Ĵ�С
	  byte[] b=new byte[size];	  
	  int i=0;
	  int count=1;
	 //Ŀ���ļ�λ��
	  File fi=new File("C:\\Users\\Administrator\\Desktop\\t");
	  if(!fi.exists())
		  fi.mkdirs();
	  
	  BufferedOutputStream bos=null;
	  Properties p=new Properties();	   
     //д��Ŀ���ļ�
	  while((i=bis.read(b))!=-1){
		 bos=new BufferedOutputStream(new FileOutputStream(new File(fi,(count++)+".mp3")));
		 bos.write(b,0,i);	
		 bos.close();
	  }
	  //д��Ŀ�������ļ�
	  bos=new BufferedOutputStream(new FileOutputStream(new File(fi,"save.properties")));
	  p.setProperty("part", count+" ");//�ӵ�һλ��ʼ��һ���ԼӼ�λ1+n�Σ�����˵�ֳ�����λ��name�����ļ����о���5��
	  p.setProperty("filename", f.getName());
	  p.store(bos,"save part:" );	
	  bis.close();
	  bos.close();
  }
}
