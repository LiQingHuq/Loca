package work5;

public class Customer implements Runnable {
    user u=new user();
	public Customer(user u) {
		// TODO �Զ����ɵĹ��캯�����
		this.u=u;
	}
        @Override
		public void run(){
        	while(true)
        	{	   
        		u.set("����");
        	}
   }
}
