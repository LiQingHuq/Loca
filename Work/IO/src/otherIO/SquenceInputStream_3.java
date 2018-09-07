package otherIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class SquenceInputStream_3 {

	public SquenceInputStream_3() {
		// TODO 自动生成的构造函数存根
	}
                  public static void main(String[] args) throws IOException {
                	  List<FileInputStream> l=new ArrayList<FileInputStream>();
                		l.add(new FileInputStream("D:\\矢野立美 - LOVE Theme from TIGA ＜M-2＞.mp3"));
                		l.add(new FileInputStream("D:\\DAISHI DANCE,Cecile Corbel - Take me hand .mp3"));
                		l.add(new FileInputStream("D:\\Boyce Avenue,Bea Miller - We Can't Stop.mp3"));
                		l.add(new FileInputStream("C:\\CloudMusic\\Pawl - Your Love Shot Me Down (Radio Edit).mp3"));
                		Enumeration<FileInputStream> en=Collections.enumeration(l);
                		SequenceInputStream sis=new SequenceInputStream(en);
                		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\a.mp3"));
                		byte[] b=new byte[sis.available()];
                		int i=0;
                		while((i=sis.read(b))!=-1)
                			bos.write(b,0,i);
                		bos.flush();
                		bos.close();
                		sis.close();
				}
}
