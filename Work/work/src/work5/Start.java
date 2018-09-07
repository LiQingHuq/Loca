package work5;

public class Start {

	public Start() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	user u=new user();
	Customer c=new Customer(u);
	Productor p=new Productor(u);
    Thread t1=new Thread(c);
    Thread t2=new Thread(c);
    Thread t3=new Thread(p);
    Thread t4=new Thread(p);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
}
}
