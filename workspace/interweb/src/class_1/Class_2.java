package class_1;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class_2 {

	public Class_2() {
		// TODO Auto-generated constructor stub
	}
    /*1����ȡClass�Ĺ��캯��
     * 2.��ȡClass ���ֶ�
     * 3.��ȡClass�Ĺ�������
     *   
     */
	 public static void main(String[] args) throws Exception {
		text_1();
		text_2();
		text_3();
		text_4();
	}
	private static void text_4() throws Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");
		Method m=c.getMethod("Look1", int.class);
		Object obj=c.newInstance();
		m.invoke(obj, 17);
		
	}
	private static void text_2() throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");//Ѱ�Ҹ������Ƶ�class�ļ����ؽ��ڴ棬����class����
		Field f=c.getDeclaredField("num");//��ȡ�ֶζ��󣬱������˽��
		System.out.println(f);//������ֶ�
		f.setAccessible(true);//ǿ���Ա������ʣ���ִ��Ȩ��
		Object obj=c.newInstance();//���г�ʼ����class����
		f.set(obj, 100);	//�ֶ�����
		Object o=f.get(obj);
		System.out.println(o);
	}
	
	
	private static void text_3() throws ClassNotFoundException, Exception, Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");
		Method m=c.getMethod("Look", null);
		Constructor<Student> cs=c.getConstructor(String.class,int.class);
		Object obj=cs.newInstance("С��",12);
		m.invoke(obj, null);
	}
	
	
	private static void text_1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");
		Constructor<Student> cs=c.getConstructor(String.class,int .class);//��������ȡ���캯��
		Object obj=cs.newInstance("tom",15);
	}
}
