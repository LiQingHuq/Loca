package text;
public class Text implements Runnable  {
   Text1 t1=new Text1();  
   public Text(Text1 u) {
		// TODO 自动生成的构造函数存根
		this.t1=u;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			t1.text();
		}
	}

}
