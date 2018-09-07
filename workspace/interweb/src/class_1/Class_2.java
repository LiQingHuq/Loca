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
    /*1，获取Class的构造函数
     * 2.获取Class 的字段
     * 3.获取Class的公共函数
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
		Class c=Class.forName("class_1.Student");//寻找该类名称的class文件加载进内存，产生class对象
		Field f=c.getDeclaredField("num");//获取字段对象，本类包含私有
		System.out.println(f);//输出看字段
		f.setAccessible(true);//强制性暴力访问，不执行权限
		Object obj=c.newInstance();//进行初始化对class对象
		f.set(obj, 100);	//字段设置
		Object o=f.get(obj);
		System.out.println(o);
	}
	
	
	private static void text_3() throws ClassNotFoundException, Exception, Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");
		Method m=c.getMethod("Look", null);
		Constructor<Student> cs=c.getConstructor(String.class,int.class);
		Object obj=cs.newInstance("小米",12);
		m.invoke(obj, null);
	}
	
	
	private static void text_1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class c=Class.forName("class_1.Student");
		Constructor<Student> cs=c.getConstructor(String.class,int .class);//构造器获取构造函数
		Object obj=cs.newInstance("tom",15);
	}
}
