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
	//����ֵ
	Long time=System.currentTimeMillis();
	//ʱ�����
	Date date=new Date();
	System.out.println(date);
	
//	Date date1=new Date();
	System.out.println(time);
	//����ֵ��ʱ�����
	Date date1=new Date(time);
	System.out.println(date1);
	//ʱ����󵽺���ֵ
	Long time1= date1.getTime();
	System.out.println(time1);
	//����ʱ��
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
	String str=df.format(date1);	
	System.out.println(str);
	//����ʱ����ַ���
	DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
	df1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	String str1=df1.format(date1);	
	System.out.println(str1);
	//�Զ���ĸ�ʽ��
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
	
	System.out.println(y+"��"+m+"��"+d+"��"+miao+"��");
	
}
}
