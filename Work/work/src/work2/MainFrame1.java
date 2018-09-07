package work2;

import java.util.Collection;
import java.util.Scanner;

public class MainFrame1 {
	public MyClassMap mc;//����
	private Scanner sc=new Scanner(System.in);
	public MainFrame1() {
		// TODO �Զ����ɵĹ��캯�����
		mc=new MyClassMap();
	}
	public Student getInfo(){//�������Ĺ��캯��
		System.out.println("������ѧ��");	
	    String id=sc.next();
	    System.out.println("������绰");	
	     int tell=sc.nextInt();
	    System.out.println("����������");	
	    String name=sc.next();
	    Student stu=new Student(id, tell, name);//���ݷ�װ�ɶ���
	    return stu;
	   
	}
	public void add(){
		Student stu=this.getInfo();//�ӿ���̨��������
		boolean is=mc.add(stu);
		if(is){
			System.err.println("��ӳɹ�");
			
		}
		else
			System.out.println("���ʧ��");
	}
	
	public void update(){
		Student stu=this.getInfo();
		boolean is=mc.update(stu);
		if(is){
			System.out.println("�޸ġ��ɹ�");
		}else
			System.out.println("�޸�ʧ��");
	   }
	public void delete(){
		System.out.println("������Ҫɾ��ѧ����ѧ��");
		String id=sc.next();
		boolean is=mc.delete(id);
		if(is){
			System.out.println("ɾ���ɹ�");
		}else
			System.out.println("ɾ��ʧ�ܣ�ѧ��������");
		
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
			  System.out.println("������Ҫ������ѡ�");
	           System.out.println("1,����");
	           System.out.println("2.ɾ��");
	           System.out.println("3,�޸�");
	           System.out.println("4,����");
	           System.out.println("5,�˳�");
	           int option=sc.nextInt();
	           switch (option) {
	       	case 1:
	       		System.out.println("��ʼ���");
	       		add();
	       		break;
	       		
	       	case 2: 
	       		System.out.println("��ʼ�޸�");
	       		update();
	       		break;
	       	case 3:
	       		System.out.println("��ʼ��ѯ");
	       		quere();
	       		break;
	       	case 4:
	       		System.out.println("��ʼɾ��");
	       		delete();
	       		break;
	       	case 5:	
	       		is=false;
	       		System.out.println("��ӭʹ�ã��´��ټ�����");
	              }
		}
		
	}
	public static void main(String[] args) {
		MainFrame mf=new MainFrame();
		mf.start();
	}

	

}
