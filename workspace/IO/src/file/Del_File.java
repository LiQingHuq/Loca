package file;

import java.io.File;

public class Del_File {

	public Del_File() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	File f=new File("tom");
   removal(f);	
}
private static void removal(File f) {
	// TODO 自动生成的方法存根
	 File[] fe=f.listFiles();
	 for(File fl:fe)
		 if(fl.isDirectory()){
			 removal(fl);
		 }
		 else 
	    System.out.println(fl+"："+fl.delete());
      System.out.println(f.delete());
}
}
