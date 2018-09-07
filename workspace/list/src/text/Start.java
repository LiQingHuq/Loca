package text;

public class Start {
   public static void main(String[] args) {
	   Text1 t1=new Text1();
	Text t2=new Text(t1);
	Thread t=new Thread(t2);
	t.start();
   }
}
