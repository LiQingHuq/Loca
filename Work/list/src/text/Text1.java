package text;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Text1 {
	
	Lock lock=new ReentrantLock();
	Condition f1=lock.newCondition();
	Condition f2=lock.newCondition();
	public boolean text(){
		boolean b=true;
        lock.lock();
        try{
        while(!b)
        
        	try {
				f1.await();
				
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
			    b=false;
				e.printStackTrace();
				System.out.println("b���޸���");
				return b;
			}
        
       // System.out.println(Thread.currentThread().getName()+"......");
        }
        finally{
        	System.out.println("finallyִ����");
			lock.unlock();
		
	    }
		return b;
		
	}

}
