package otherIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_1 {

	public PrintStream_1() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) throws FileNotFoundException {
	 File f=new File("demo.txt");
	 PrintStream ps=new PrintStream(f);
	 ps.println(97);
     ps.write(97);
     ps.close();
}
}
