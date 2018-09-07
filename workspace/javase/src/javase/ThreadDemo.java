package javase;

public class ThreadDemo {
	public static void main(String[] args) {
		ticket i=new ticket();
		 // Demo d=new Demo();
Thread t1=new Thread(i);
Thread t2=new Thread(i);
Thread t3=new Thread(i);
Thread t4=new Thread(i);

//Thread td=new Thread(d);
//Thread th=new Thread(d);
//Thread tm=new Thread(d);
//td.start();
//th.start();
//tm.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}	
}
