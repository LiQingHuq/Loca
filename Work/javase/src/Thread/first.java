package Thread;

public class first {

	public first() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args) {
		save_money s=new save_money();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		t1.start();
		t2.start();
		t3.start();
	}

}
