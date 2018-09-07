package javase;

public class Demo implements Runnable {

//	public Demo() {
//		// TODO 自动生成的构造函数存根
//	}
	
//	 public static void main(String[] args){
//		  Demo d=new Demo();
	    
	      
		 //不是线程（thread）对象，当
//			Demo d1=new Demo();
//			Demo d2=new Demo();
//			Demo d3=new Demo();
//			d1.start();
//		
//			d3.start();
//			
//			d2.start();
//		}
	
	 @Override
	public void run(){
			for(int i=0;i<20;i++){
				System.out.println(Thread.currentThread().getName()+"......"+i);
			}
		}	
}

	

