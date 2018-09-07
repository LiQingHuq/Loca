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
		// TODO 自动生成的构造函数存根
	}
	
   public static void main(String[] args) throws IOException {
	   File f=new File("C:\\Users\\Administrator\\Desktop\\a.mp3");
	split(f);
    }
   
  public static void  split(File f) throws IOException{
	  BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
	  //定义每一个目的文件的大小
	  byte[] b=new byte[size];	  
	  int i=0;
	  int count=1;
	 //目的文件位置
	  File fi=new File("C:\\Users\\Administrator\\Desktop\\t");
	  if(!fi.exists())
		  fi.mkdirs();
	  
	  BufferedOutputStream bos=null;
	  Properties p=new Properties();	   
     //写入目的文件
	  while((i=bis.read(b))!=-1){
		 bos=new BufferedOutputStream(new FileOutputStream(new File(fi,(count++)+".mp3")));
		 bos.write(b,0,i);	
		 bos.close();
	  }
	  //写入目的配置文件
	  bos=new BufferedOutputStream(new FileOutputStream(new File(fi,"save.properties")));
	  p.setProperty("part", count+" ");//从第一位开始，一共自加几位1+n次；比如说分成了四位，name配置文件当中就是5；
	  p.setProperty("filename", f.getName());
	  p.store(bos,"save part:" );	
	  bis.close();
	  bos.close();
  }
}
