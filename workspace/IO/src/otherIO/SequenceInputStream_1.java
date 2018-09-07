package otherIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream_1 {

	public SequenceInputStream_1() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	
            Vector<FileInputStream> l=new Vector<FileInputStream>();
                l.add(new FileInputStream("a.txt"));
                l.add(new FileInputStream("all.txt"));
                l.add(new FileInputStream("demo.txt"));
                Enumeration<FileInputStream> ef=l.elements();
                SequenceInputStream sis=new SequenceInputStream(ef);
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("1.txt")); 
                byte[] b=new byte[sis.available()];
                int n=0;
                while((n=sis.read(b))!=-1)
               	bos.write(b,0,n);
                bos.flush();
                bos.close();
sis.close();
}       
}
