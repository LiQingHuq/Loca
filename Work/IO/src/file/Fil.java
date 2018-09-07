package file;

import java.io.File;
import java.io.FilenameFilter;

public class Fil implements FilenameFilter {

	public Fil() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO 自动生成的方法存根
		return name.endsWith(".XML");
	}

}
