package file;

import java.io.File;

public class Del_File {

	public Del_File() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	File f=new File("tom");
   removal(f);	
}
private static void removal(File f) {
	// TODO �Զ����ɵķ������
	 File[] fe=f.listFiles();
	 for(File fl:fe)
		 if(fl.isDirectory()){
			 removal(fl);
		 }
		 else 
	    System.out.println(fl+"��"+fl.delete());
      System.out.println(f.delete());
}
}
