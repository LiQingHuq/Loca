package file;

import java.io.File;

public class Del_FIle2 {

	public Del_FIle2() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	File f=new File("tom");
	remove(f);
}
private static void remove(File f) {
	// TODO 自动生成的方法存根
	File[] fi=f.listFiles();
	for(File fl:fi){
		if(fl.isDirectory())
			remove(fl);
		else
			System.out.println(fl.delete());
	}
	System.out.println(f.delete());
}
}
