package otherIO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFIle_1 {

	public RandomAccessFIle_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public static void main(String[] args) throws IOException {
    	File f=new File("RanAccessFile.txt");
		//write(f);
//    	write_1(f);
		read(f);
	}
	private static void read(File f) throws IOException {
		// TODO �Զ����ɵķ������
		
		RandomAccessFile raf=new RandomAccessFile(f, "rw");
		raf.seek(1*8);
		byte[] b=new byte[4];
		raf.read(b);
		String name=new String(b);
		int age=raf.readInt();
		System.out.println("name:"+name+"\tage:"+age); 
		System.out.println(raf.getFilePointer());
		raf.close();
	}
	private static void write(File f) throws IOException {
		// TODO �Զ����ɵķ������
		RandomAccessFile raf=new RandomAccessFile(f, "rw");
		raf.write("���".getBytes());
		raf.writeInt(55);
		raf.write("��".getBytes());
		raf.writeInt(66);
		raf.write("���".getBytes());
		raf.writeInt(6);
		raf.write("����".getBytes());
		raf.writeInt(89);
		raf.write("�ӷ�".getBytes());
		raf.writeInt(6);
		raf.close();
	}
	private static void write_1(File f) throws IOException {
		// TODO �Զ����ɵķ������
		RandomAccessFile raf=new RandomAccessFile(f, "rw");
		raf.seek(1*8);
		raf.write("hhah".getBytes());
		raf.writeInt(699);
		raf.close();
	}
}
