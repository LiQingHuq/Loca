package zen_ze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zen_4 {

	public Zen_4() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
	String str="da asd dassad asf  ds ad a sd asd  d sad s ad asd as d asd  dsa";
	String s="\\b[a-z]{6}\\b";
	Pattern p=Pattern.compile(s);//将正则表达式进行封装
	Matcher m=p.matcher(str);//调用matcher的方法
	
	System.out.println(str);
	while(m.find()){//matcher方法在字符里面寻找!
		System.out.println(m.group());
		System.out.println(m.start()+":"+m.end());
	}
}
} 
