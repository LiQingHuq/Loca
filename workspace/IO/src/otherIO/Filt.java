package otherIO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Filt implements FilenameFilter {
    //������һ��������
	
	private String s;

	public Filt(String s) {
		super();
		this.s = s;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO �Զ����ɵķ������
		return name.endsWith(s);
	}

}
