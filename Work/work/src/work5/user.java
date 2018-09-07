package work5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class user {

	private String name;
	private  int count=1;
	private  boolean flag=false;
	//创建一个锁对象
	Lock lock=new ReentrantLock();
	//创建俩个监听者，一组监听消费者，一组监听生产者
	Condition cus_con=lock.newCondition();
	Condition Pro_con=lock.newCondition();
	
	//生产者
	public void set (String name){
		lock.lock();
		try{
		while(flag)//默认flag为false			
			try {
				Pro_con.await();
			} 
			catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产了..."+this.name);
			flag=true;		
			//notify();
			cus_con.signal();
		}
			finally{
				lock.unlock();
			
		}
	}
	//消费者
    public void out(){
    	lock.lock();
    	try{
	    while(!flag)
		    try {
				cus_con.await();
			} 
		    catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

		    System.out.println(Thread.currentThread().getName()+"...sale..."+this.name);
	        flag=false;
	        //notifyAll();
	        Pro_con.signal();
	        }
    	finally{
    		lock.unlock();
    	}
	    }
}
