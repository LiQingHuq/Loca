package otherIO;

import java.io.IOException;
import java.io.PipedInputStream;

public class Piped_in implements Runnable {

	public PipedInputStream in;
	public Piped_in(PipedInputStream in) {
		super();
		this.in = in;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		in=new PipedInputStream();
		byte[] b=new byte[1024];
		try {
			int h=in.read(b);
			String s=new String(b, 0, h);
			System.out.println("s="+s);
			in.close();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
		System.out.println("why����������");
		}

	}

}
