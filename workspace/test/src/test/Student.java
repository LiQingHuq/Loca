package test;

public class Student {

   private String id;//������ԣ�һ��������������
   private  String name;
   private  int age;
    public Student(String id, String name, int age) {
	// TODO �Զ����ɵĹ��캯�����
    	this.id=id;
    	this.name=name;
    	this.age=age;
}
	public void watch(){
    	System.out.println(name+"�ٿ�java���������鼮");}
    public  void love(){
    		System.out.println(name+"�����໪");
    	}
    public void student() {
		
	}
    public void student(String id,String name, int age) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
		
	}
    public void setId(String id){//�������
    	this.id=id;//����������ID
    }
    public String getId(){
    	return id;
    }
    public void setName(String name){
    	this.name=name;
    }
    public String getName(){
    	return name;
    }
    public void setAge(int age){
    	this.age=age;
    }
    public int getAge(){
    	return age;
    
   }
}

