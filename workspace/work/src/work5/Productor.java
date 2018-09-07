package work5;

public class Productor implements Runnable{
user u=new user();
	public Productor(user u) {
		// TODO 自动生成的构造函数存根
		this.u=u;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true)
		{
			u.out();
		}
	}

}
