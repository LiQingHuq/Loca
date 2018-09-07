package otherIO;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Piped_out implements Runnable{

	public PipedOutputStream out;

	public Piped_out(PipedOutputStream out) {
		super();
		this.out = out;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		try {
			Thread.sleep(2000);
			out.write("hello 管道你好".getBytes());
		} catch (IOException | InterruptedException e) {
			// TODO 自动生成的 catch 块
		System.out.println("管道出问题了");
		}
	}

}
