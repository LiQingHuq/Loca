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
		// TODO 自动生成的方法存根
		in=new PipedInputStream();
		byte[] b=new byte[1024];
		try {
			int h=in.read(b);
			String s=new String(b, 0, h);
			System.out.println("s="+s);
			in.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
		System.out.println("why发生错误了");
		}

	}

}
