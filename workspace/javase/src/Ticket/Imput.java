package Ticket;

public class Imput implements Runnable{
Object obj=new Object();

	Tone t;
	public Imput(Tone t){
		this.t=t;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		int x=0;
		
	while(true){		
		
		if(x==0){
		    t.set("jack","man");		
		}
		else
		{
			t.set("¶��","ŮŮŮŮŮ");
		}	
		x=(x+1)%2;
	}
  }
}
