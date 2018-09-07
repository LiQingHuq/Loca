package Thread;

public class bank {
int money=0;
	public bank() {
		// TODO 自动生成的构造函数存根
	}
	public synchronized void save(int num){
		money=money+num;
		System.out.println("money="+money);
	}

}
