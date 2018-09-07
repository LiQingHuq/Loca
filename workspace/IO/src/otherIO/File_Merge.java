package otherIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class File_Merge {

	public File_Merge() {
		// TODO 自动生成的构造函数存根
	}
         public static void main(String[] args) throws IOException {
        		File f=new File("C:\\Users\\Administrator\\Desktop\\b");
			merge(f);
		}
		private static void merge(File f) throws IOException {
			// TODO 自动生成的方法存根
          ArrayList<FileInputStream> af=new ArrayList<FileInputStream>();
		int g=1;
		while(g<=3)
		     af.add(new FileInputStream(new File(f,(g++)+".part")));
		 	    
		    Enumeration<FileInputStream> ef=Collections.enumeration(af);
			SequenceInputStream sis=new SequenceInputStream(ef);
			File fe=new File("C:\\Users\\Administrator\\Desktop\\c.mp3");
			if(!fe.isDirectory())
                 fe.createNewFile();
			byte[] b=new byte[sis.available()];
			int x=0;
			BufferedOutputStream fos=null;
			while((x=sis.read(b))!=-1){
				fos=new BufferedOutputStream(new FileOutputStream(fe));
				fos.write(b);
			}

		}
         
}
