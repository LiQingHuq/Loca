package list;

public class Student extends Persion {

	public Student(String name, int age) {
		super(name, age);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "student->"+"������"+getName()+"���䣺"+getAge();
	}


	

}
