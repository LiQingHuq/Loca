package Thread;

public class bank {
int money=0;
	public bank() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public synchronized void save(int num){
		money=money+num;
		System.out.println("money="+money);
	}

}
