package class_2;

public class Zhu_Ban {

	public Zhu_Ban() {
		// TODO Auto-generated constructor stub
	}
   public void run()
   {
	   System.out.println("Ö÷°åÔËÐÐ£¡");
   }
   
  public  void Use_PIC(PIC p){
	  if(p!=null)
	  {
		  p.close();
		  p.open();
	  }
  }
}
