 package otherIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class file_Merge_1 {
        public static void main(String[] args) throws IOException {
	    File f=new File("C:\\Users\\Administrator\\Desktop\\t");
	    ToAll(f);
	
}
		private static void ToAll(File f) throws IOException {
			//第一步:源配置文件当中查询目标目录，
			File [] i=f.listFiles(new Filt(".properties"));
			//第二步：判断是否只有这个配置文件
			if(i.length!=1)
				throw new RuntimeException(f+"配置文件不对");
			//第三步，如果配置文件有存入一个文件
			File fi=i[0];
			//第四步从文件当中取
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fi));
			//要取键值对配置文件使用properties类
			Properties p=new Properties();
			p.load(bis);
			String s=p.getProperty("part");
			String name=p.getProperty("filename");			
			int c=Integer.parseInt(s.trim());
			//判断一下文件是否少了或者多了。
			File[] f2=f.listFiles(new Filt(".mp3"));
			if(f2.length!=(c-1))
				throw new RuntimeException(f+"文件数量不对");
			
			
			ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
			for(int s1=1;s1<=f2.length;s1++){
				al.add(new FileInputStream(new File(f,s1+".mp3")));
			}
			
			Enumeration<FileInputStream> ef=Collections.enumeration(al);
			SequenceInputStream sis=new SequenceInputStream(ef);
			File fl=new File("C:\\Users\\Administrator\\Desktop\\d");
			
			if(!fl.exists())
				fl.mkdirs();
			
			BufferedOutputStream bos=null;
			byte[] b=new byte[1024*1024*40];
			int ch=0;
			while((ch=sis.read(b))!=-1)
			{
			 bos=new BufferedOutputStream(new FileOutputStream(new File(fl,"new.mp3")));
				bos.write(b,0,ch);
				bos.flush();
				bos.close();
			}
			sis.close();
		   }

}
