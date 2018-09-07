package list;

public class Student extends Persion {

	public Student(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "student->"+"姓名："+getName()+"年龄："+getAge();
	}


	

}
