package file;

import java.io.File;
import java.io.FileFilter;

public class Fil_1 implements FileFilter {

	public Fil_1() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean accept(File pathname) {
		// TODO �Զ����ɵķ������
		return pathname.isHidden();
	}

}
