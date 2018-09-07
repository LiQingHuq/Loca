package Ticket;

public class Tone {
	private String name;
	private String sex;	
	private boolean flag=false;
	public synchronized void set(String name,String sex){		
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		this.name=name;
		this.sex=sex;
		flag=true;
		notify();
				
	}
	
	public synchronized void out(){
		if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		System.out.println(name+"....."+sex);
		flag=false;
		notify();
	}
}
