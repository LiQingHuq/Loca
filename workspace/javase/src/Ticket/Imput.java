package Ticket;

public class Imput implements Runnable{
Object obj=new Object();

	Tone t;
	public Imput(Tone t){
		this.t=t;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		int x=0;
		
	while(true){		
		
		if(x==0){
		    t.set("jack","man");		
		}
		else
		{
			t.set("露西","女女女女女");
		}	
		x=(x+1)%2;
	}
  }
}
