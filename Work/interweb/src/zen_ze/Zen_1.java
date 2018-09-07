package zen_ze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zen_1 {
/*
 * 正则表达式——匹配——自改
 */
	public Zen_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws Exception {
		boolean bo=true;
		while(bo){
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  String tell=br.readLine();
		Zen_1 z=new Zen_1();
		z.Pi_Pei(tell);
		if(tell.equals("over"))
			break;
		}
	}
    public  void Pi_Pei(String tell){
	  String regex="1[3578][0-9]{9}";
	     boolean b=tell.matches(regex);
	     System.out.println(tell+b);
  }
}
