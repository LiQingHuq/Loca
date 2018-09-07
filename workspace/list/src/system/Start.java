package system;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Start {

	public Start() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime r=Runtime.getRuntime();	
		Process p=r.exec("Notepad.exe C:\\Users\\Administrator\\Desktop\\java三大主流框架.txt");
		Thread.sleep(4000);
		p.destroy();
		
		double d1=Math.ceil(12.56);
		double d2=Math.floor(12.56);
		double d3=Math.round(12.56);

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		
		
		for(int i=0;i<10;i++)
		{
			double dr=(int)(Math.random()*10+1);
			System.out.println(dr);
		}
			//		demo_1();
	}
	public static void demo_1() {
		// TODO 自动生成的方法存根
      
		 Properties prop=System.getProperties();
		 Set<String> nameSet=prop.stringPropertyNames();
		 for(String name:nameSet){
			 String value=prop.getProperty(name);
			 System.out.println(name+":"+value);
		 }
	}
}
