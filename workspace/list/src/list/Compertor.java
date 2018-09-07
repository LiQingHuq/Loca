package list;

import java.util.Comparator;

public class Compertor implements Comparator<Persion> {

	public Compertor() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public int compare(Persion o1, Persion o2) {
		// TODO 自动生成的方法存根
		int t=o1.getName().compareTo(o2.getName());		
		return t==0?o1.getAge()-o2.getAge():t;
	}

}
