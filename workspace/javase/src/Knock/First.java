package Knock;

public class First implements Runnable {
private int num=100;
	public void sale(){
		System.out.println(Thread.currentThread()+"....sale..."+num--);
	}
	
	@Override
	public void run(){
		while(true){
		synchronized (First.class) {					
		           sale();
		                 }
		      }
	}      
}
