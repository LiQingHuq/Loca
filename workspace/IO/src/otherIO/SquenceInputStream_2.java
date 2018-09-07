package otherIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class SquenceInputStream_2 {

	public SquenceInputStream_2() {
		// TODO 自动生成的构造函数存根
	}
        public static void main(String[] args) throws IOException {
	List<FileInputStream> l=new ArrayList<FileInputStream>();

	l.add(new FileInputStream("a1.txt"));
	l.add(new FileInputStream("demo.txt"));
	l.add(new FileInputStream("a.txt"));
	Enumeration<FileInputStream> en=Collections.enumeration(l);
	SequenceInputStream sis=new SequenceInputStream(en);
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("1.txt"));
	byte[] b=new byte[sis.available()];
	int i=0;
	while((i=sis.read(b))!=-1)
		bos.write(b,0,i);
	bos.flush();
	bos.close();
	sis.close();
}
}
