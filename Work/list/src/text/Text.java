package text;
public class Text implements Runnable  {
   Text1 t1=new Text1();  
   public Text(Text1 u) {
		// TODO �Զ����ɵĹ��캯�����
		this.t1=u;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			t1.text();
		}
	}

}
