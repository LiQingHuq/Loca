package work5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class user {

	private String name;
	private  int count=1;
	private  boolean flag=false;
	//����һ��������
	Lock lock=new ReentrantLock();
	//�������������ߣ�һ����������ߣ�һ�����������
	Condition cus_con=lock.newCondition();
	Condition Pro_con=lock.newCondition();
	
	//������
	public void set (String name){
		lock.lock();
		try{
		while(flag)//Ĭ��flagΪfalse			
			try {
				Pro_con.await();
			} 
			catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
			flag=true;		
			//notify();
			cus_con.signal();
		}
			finally{
				lock.unlock();
			
		}
	}
	//������
    public void out(){
    	lock.lock();
    	try{
	    while(!flag)
		    try {
				cus_con.await();
			} 
		    catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
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
