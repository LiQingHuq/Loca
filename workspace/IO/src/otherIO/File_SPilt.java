package otherIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_SPilt {

	private static final int size = 1024*1024*10;
	public File_SPilt() {
		// TODO 自动生成的构造函数存根
	}

	   public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Administrator\\Desktop\\a.mp3");
		Split(f);
    
	   }
	   
	   public static void Split(File f) throws IOException{
		   FileInputStream fis=new FileInputStream(f);
		   
		   
		   FileOutputStream fos=null;
		   byte [] b=new byte[size];
		   int i=0;
		   int count=1;
		   File fl=new File("C:\\Users\\Administrator\\Desktop\\b");
		   if(!fl.exists()){
			   fl.mkdirs();
		   }
		   
		   while((i=fis.read(b))!=-1){
			 fos=new FileOutputStream(new File(fl,(count++)+".part"));
			 fos.write(b, 0, i);
			 fos.flush();		
		   }
			 fos.close();
			 fis.close();
	   }
}
