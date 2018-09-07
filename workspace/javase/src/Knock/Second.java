package Knock;

public class Second {	
	public static void main(String[] args) {
		First f=new First();
		Thread t=new Thread(f);
		Thread d=new Thread(f);
		t.start();
		d.start();
		
	}

}
