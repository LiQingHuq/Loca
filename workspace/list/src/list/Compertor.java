package list;

import java.util.Comparator;

public class Compertor implements Comparator<Persion> {

	public Compertor() {
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public int compare(Persion o1, Persion o2) {
		// TODO �Զ����ɵķ������
		int t=o1.getName().compareTo(o2.getName());		
		return t==0?o1.getAge()-o2.getAge():t;
	}

}
