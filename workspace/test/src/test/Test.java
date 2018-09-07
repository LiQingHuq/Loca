package test;

public class Test {
public static void main(String[] args) {
	Student stu []=new Student[3];
	Student stu1=new Student("a1","b1",12);
	Student stu2=new Student("a2","b2",34);
	Student stu3=new Student("a3","b3",37);
	stu[0]=stu1;
	stu[1]=stu2;
	stu[2]=stu3;
	stu[2].setName("Éµ¹Ï");
	System.out.println(stu[1].getName());
	for(int i=0;i<stu.length;i++)
		System.out.println(stu[i].getName());
}
}
