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
				// TODO 自动生成的 catch 块
			    b=false;
				e.printStackTrace();
				System.out.println("b被修改了");
				return b;
			}
        
       // System.out.println(Thread.currentThread().getName()+"......");
        }
        finally{
        	System.out.println("finally执行了");
			lock.unlock();
		
	    }
		return b;
		
	}

}
