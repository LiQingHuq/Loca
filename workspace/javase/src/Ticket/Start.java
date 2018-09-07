package Ticket;

public class Start {

	public Start() {
		// TODO 自动生成的构造函数存根
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
