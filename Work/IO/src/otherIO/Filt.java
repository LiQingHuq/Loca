package otherIO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Filt implements FilenameFilter {
    //创建了一个过滤器
	
	private String s;

	public Filt(String s) {
		super();
		this.s = s;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO 自动生成的方法存根
		return name.endsWith(s);
	}

}
