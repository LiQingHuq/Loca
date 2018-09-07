package work2;

import java.util.Collection;
import java.util.Scanner;

public class MainFrame1 {
	public MyClassMap mc;//对象
	private Scanner sc=new Scanner(System.in);
	public MainFrame1() {
		// TODO 自动生成的构造函数存根
		mc=new MyClassMap();
	}
	public Student getInfo(){//带参数的构造函数
		System.out.println("请输入学号");	
	    String id=sc.next();
	    System.out.println("请输入电话");	
	     int tell=sc.nextInt();
	    System.out.println("请输入姓名");	
	    String name=sc.next();
	    Student stu=new Student(id, tell, name);//数据封装成对象，
	    return stu;
	   
	}
	public void add(){
		Student stu=this.getInfo();//从控制台接收数据
		boolean is=mc.add(stu);
		if(is){
			System.err.println("添加成功");
			
		}
		else
			System.out.println("添加失败");
	}
	
	public void update(){
		Student stu=this.getInfo();
		boolean is=mc.update(stu);
		if(is){
			System.out.println("修改·成功");
		}else
			System.out.println("修改失败");
	   }
	public void delete(){
		System.out.println("请输入要删除学生的学号");
		String id=sc.next();
		boolean is=mc.delete(id);
		if(is){
			System.out.println("删除成功");
		}else
			System.out.println("删除失败，学生不存在");
		
	}
	
	public void quere(){
		Collection<Student> stulist=mc.query();
		for(Student s:stulist){
             System.out.println("ID:"+s.getId()+"tell:"+s.geiTell()+"name:"+s.geiName());
             
		}
	}
	
	public void start(){
		boolean is=true;
		while(is){
			  System.out.println("输入你要操作的选项：");
	           System.out.println("1,增加");
	           System.out.println("2.删除");
	           System.out.println("3,修改");
	           System.out.println("4,查找");
	           System.out.println("5,退出");
	           int option=sc.nextInt();
	           switch (option) {
	       	case 1:
	       		System.out.println("开始添加");
	       		add();
	       		break;
	       		
	       	case 2: 
	       		System.out.println("开始修改");
	       		update();
	       		break;
	       	case 3:
	       		System.out.println("开始查询");
	       		quere();
	       		break;
	       	case 4:
	       		System.out.println("开始删除");
	       		delete();
	       		break;
	       	case 5:	
	       		is=false;
	       		System.out.println("欢迎使用，下次再见！！");
	              }
		}
		
	}
	public static void main(String[] args) {
		MainFrame mf=new MainFrame();
		mf.start();
	}

	

}
