package class_1;

public class Class_1 {

	public Class_1() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws ClassNotFoundException {
		test_1();
		test_2();
		test_3();
	}
    private static void test_1(){
//    	Student s=new Student();
//    	Class c=s.getClass();
//    	Student s1=new Student();
//    	Class c1=s.getClass();
//    	System.out.println(c==c1);
    }
    private static void test_2(){
    	Class c=Student.class;
    	Class c1=Student.class;
    	System.out.println(c==c1);
    	
    }
    
    private static void test_3() throws ClassNotFoundException{
    		
    	String class_name="class_1.Student";
    	Class c=Class.forName(class_name);
    	System.out.println(c);
   	}
   }
