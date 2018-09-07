package Thread;

public class save_money extends Thread{
     bank b=new bank();
	public save_money() {
		// TODO 自动生成的构造函数存根
	}
@Override
public void run(){
	for(int i=0;i<3;i++){
		b.save(400);
	}
}
}
