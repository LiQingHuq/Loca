package class_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main_test {
//µÁƒ‘‘À––
	public Main_test() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws IOException, Exception {
		Zhu_Ban zb=new Zhu_Ban();
		zb.run();
		
		File configfile=new File("PC.properties");
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream(configfile);
	    prop.load(fs);
	    for(int i=1;i<=prop.size();i++)
	    {
	    	String PICName=prop.getProperty("pci"+i);
	    	Class<?> c=Class.forName(PICName);
	    	PIC p=(PIC)c.newInstance();
	    	zb.Use_PIC(p);
	    }
	   fs.close();
	}
}
