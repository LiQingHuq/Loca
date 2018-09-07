package file;

import java.io.File;

public class Text {

	public Text() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	File f=new File("D:\\Android studio APP\\MyApplication2");
	list_All(f,0);
}
private static void list_All(File f,int l) {
	// TODO 自动生成的方法存根
	//获取指定目录下的所以指定目录项
	System.out.println(getL(l)+f.getName());
	l++;
    File[] di=f.listFiles();
     for(int x=0;x<di.length;x++){
         if(di[x].isDirectory())
        	 list_All(di[x],l);
         else        	
    	 System.out.println(getL(l)+di[x].getName());
     }
     }
 public static String getL(int l){
	 StringBuffer sb=new StringBuffer();
	 sb.append("|--");
	 for(int i=0;i<l;i++)
		 sb.append("|--");
      return sb.toString();
 }  
}
