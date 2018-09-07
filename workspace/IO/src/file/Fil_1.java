package file;

import java.io.File;
import java.io.FileFilter;

public class Fil_1 implements FileFilter {

	public Fil_1() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean accept(File pathname) {
		// TODO 自动生成的方法存根
		return pathname.isHidden();
	}

}
