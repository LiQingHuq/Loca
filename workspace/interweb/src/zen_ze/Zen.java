package zen_ze;

public class Zen {

	public Zen() {
		// TODO Auto-generated constructor stub
	}
   public static void main(String[] args) {
	   String qq="1234518";
	//  checkQQ(qq);
	  
	  String regex="[1-9][0-9]{4,14}";
      boolean b=qq.matches(regex);
      System.out.println(qq+":"+b);
}
    private static void checkQQ(String qq) {
	// TODO Auto-generated method stub
    	int l=qq.length();
	if(l<15&&l>5)
	{
		if(!qq.startsWith("0"))
		{
			try{
			long lo=Long.parseLong(qq);
			System.out.println(qq);
			}
			catch(Exception e){
				System.out.println("含非法字符！");
			}
		}
		else{
			System.out.println(qq+"不能以0开头！");
		}
	}
	else{
		System.out.println(qq+":长度不对！");
	}
	
	
   }
}
