package work5;

public class Productor implements Runnable{
user u=new user();
	public Productor(user u) {
		// TODO �Զ����ɵĹ��캯�����
		this.u=u;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true)
		{
			u.out();
		}
	}

}
