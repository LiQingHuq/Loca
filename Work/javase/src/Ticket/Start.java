package Ticket;

public class Start {

	public Start() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public static void main(String[] args){
		Tone t=new Tone();
		Imput i=new Imput(t);
		Output o=new Output(t);
		Thread t1=new Thread(i);
		Thread t2=new Thread(o);
		t1.start();
		t2.start();
	}

}
