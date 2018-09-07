package map;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Student> {

	public ComparatorByName() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO 自动生成的方法存根
		int Temp=o1.geiName().compareTo(o2.geiName());
		return Temp==0?o1.geiTell()-o2.geiTell():Temp;
	}

}
