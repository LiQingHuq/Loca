package Ticket;

public class Output implements Runnable {
	Object obj=new Object();
    Tone t;
	public Output(Tone t) {
		// TODO 自动生成的构造函数存根
		this.t=t;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
		t.out();
		}
		
	}

}
