package map;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Student> {

	public ComparatorByName() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO �Զ����ɵķ������
		int Temp=o1.geiName().compareTo(o2.geiName());
		return Temp==0?o1.geiTell()-o2.geiTell():Temp;
	}

}
