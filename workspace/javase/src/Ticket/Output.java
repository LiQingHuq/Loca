package Ticket;

public class Output implements Runnable {
	Object obj=new Object();
    Tone t;
	public Output(Tone t) {
		// TODO �Զ����ɵĹ��캯�����
		this.t=t;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
		t.out();
		}
		
	}

}
