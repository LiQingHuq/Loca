package work4;

public class Imput implements Runnable{

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
