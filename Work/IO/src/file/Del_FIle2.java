package file;

import java.io.File;

public class Del_FIle2 {

	public Del_FIle2() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	File f=new File("tom");
	remove(f);
}
private static void remove(File f) {
	// TODO �Զ����ɵķ������
	File[] fi=f.listFiles();
	for(File fl:fi){
		if(fl.isDirectory())
			remove(fl);
		else
			System.out.println(fl.delete());
	}
	System.out.println(f.delete());
}
}
