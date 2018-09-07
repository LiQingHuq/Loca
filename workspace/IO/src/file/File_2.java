package file;

import java.io.File;

public class File_2 {

	public File_2() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	File f=new File("D:\\");
	File[] s=f.listFiles(new Fil_1());
		
		
	for(File st:s)
    System.out.println(st);			
}
}
