package file;

import java.io.File;
import java.io.IOException;

public class New_file {

	public New_file() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public static void main(String[] args) throws IOException {
//          File f=new File("a1.txt");
//          boolean b=f.createNewFile(); 
//          boolean bl=f.delete();
//          System.out.println(bl);
//          System.out.println(b);
    	
    	
    	
    	
    File f=new File("tom\\a\\b\\c\\d");
     boolean b2=f.mkdirs();
    System.out.println("b2"+b2);
////     boolean b3=f.delete();
//    	
    	File o=new File("a.txt");
    	boolean bl=o.exists();
    	System.out.println("bl:"+bl);
    	System.out.println("�ļ���"+o.isFile());		
    	System.out.println("Ŀ¼��"+o.isDirectory());
    
    }
}
