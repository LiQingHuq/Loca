package list;

public class Persion implements Comparable<Persion> {
 
	private String name;	
	private int age;
	public Persion(String name,int age) {
		this.name=name;
		this.age=age;	
	}
	public Persion() {
		// TODO 自动生成的构造函数存根
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Persion o) {
		// TODO 自动生成的方法存根
		int temp=this.age-o.age;
		return temp==0?this.name.compareTo(o.name):temp;
	}

}
