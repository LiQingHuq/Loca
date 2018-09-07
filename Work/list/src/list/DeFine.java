package list;

public class DeFine {

	public DeFine() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	Tool<Student> t=new Tool<Student>();
	t.setQ(new Student("Tom",1));
	Student s=t.getQ();
	System.out.println(s.getAge()+"岁........"+s.getName());
	Tool<String> s1=new Tool<String>();
	s1.show("first");
	s1.print("second");
	Im i=new Im();
	i.show("hello_world!!");
	Imq<Integer> it=new Imq<Integer>();
	it.show(110);
}
}
