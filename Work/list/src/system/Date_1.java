package system;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_1 {
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	//毫秒值
	Long time=System.currentTimeMillis();
	//时间对象
	Date date=new Date();
	System.out.println(date);
	
//	Date date1=new Date();
	System.out.println(time);
	//毫秒值到时间对象
	Date date1=new Date(time);
	System.out.println(date1);
	//时间对象到毫秒值
	Long time1= date1.getTime();
	System.out.println(time1);
	//具体时间
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
	String str=df.format(date1);	
	System.out.println(str);
	//具体时间的字符串
	DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
	df1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	String str1=df1.format(date1);	
	System.out.println(str1);
	//自定义的格式：
	DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
	df2=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	df2=new SimpleDateFormat("yyyy:MM:dd");
	String stu2=df2.format(date1);
	System.out.println(stu2);
	
	
	Calendar c=Calendar.getInstance();
	
	int y=c.get(Calendar.YEAR);
	int m=c.get(Calendar.MONTH)+1;
	int d=c.get(Calendar.DATE);
	int miao=c.get(Calendar.MINUTE);
	
	System.out.println(y+"年"+m+"月"+d+"日"+miao+"秒");
	
}
}
