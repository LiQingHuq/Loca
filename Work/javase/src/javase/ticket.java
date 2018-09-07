package javase;

public class ticket implements Runnable{ //extends Thread{
	private int  num=200;	
	@Override
	public void run(){
		sale();
	}
	public void sale(){		
		while(true){
			synchronized (this) 						
			{
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale...."+num--);
		}
		
			}
		}
	}
}
