package class_1;

public class Student {
 
	

	private String name;
	private int num;
	public Student(String name,int num) {
		super();
		this.num = num;
		this.name = name;
		System.out.println("name:"+name+"\tnum:"+num);
	}
	public Student(){
		super();
		System.out.println("null");
	}
	public void Look(){
		System.out.println("��ȡ���������޲�");
	}
	public void Look1(int i){
		System.out.println("��ȡ���������в�"+i);
	}
	
   
}
