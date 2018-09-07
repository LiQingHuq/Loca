package work5;

public class Customer implements Runnable {
    user u=new user();
	public Customer(user u) {
		// TODO 自动生成的构造函数存根
		this.u=u;
	}
        @Override
		public void run(){
        	while(true)
        	{	   
        		u.set("烤鸡");
        	}
   }
}
