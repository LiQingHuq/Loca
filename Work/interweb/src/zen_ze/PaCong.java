package zen_ze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaCong {

	public PaCong() {
		// TODO Auto-generated constructor stub
	}
  public static void main(String[] args) {
	       List<String> s=getMail();
	       for(String name:s)
	       System.out.println(name);
	      
}
private static List<String>  getMail() {
	List<String> list=new ArrayList<String>();
	// TODO Auto-generated method stub
	try {
	URL url=new URL("http://www.scetc.net/");
	BufferedReader bufIn=new BufferedReader(new InputStreamReader(url.openStream()));
	String regex="\\w+@\\w+(\\.\\w+)+";	
	Pattern p=Pattern.compile(regex);
	String line=null;
	 BufferedWriter b=new BufferedWriter(new FileWriter("a.start"));
		while((line=bufIn.readLine())!=null){
			Matcher m=p.matcher(line);
			while(m.find()){
				list.add(String.valueOf(m.groupCount()));	
				b.write(String.valueOf(m.groupCount()));
				b.flush();
			}
		}
	}
	catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	return list;
	
}
}
