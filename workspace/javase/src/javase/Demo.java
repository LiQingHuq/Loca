package javase;

public class Demo implements Runnable {

//	public Demo() {
//		// TODO �Զ����ɵĹ��캯�����
//	}
	
//	 public static void main(String[] args){
//		  Demo d=new Demo();
	    
	      
		 //�����̣߳�thread�����󣬵�
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

	

