package file;

import java.io.File;
import java.io.FilenameFilter;

public class Fil implements FilenameFilter {

	public Fil() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO �Զ����ɵķ������
		return name.endsWith(".XML");
	}

}
