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
		// TODO �Զ����ɵķ������
		
		try {
			Thread.sleep(2000);
			out.write("hello �ܵ����".getBytes());
		} catch (IOException | InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
		System.out.println("�ܵ���������");
		}
	}

}
