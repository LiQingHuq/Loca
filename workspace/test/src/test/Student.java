package test;

public class Student {

   private String id;//类的属性，一个属性俩个方法
   private  String name;
   private  int age;
    public Student(String id, String name, int age) {
	// TODO 自动生成的构造函数存根
    	this.id=id;
    	this.name=name;
    	this.age=age;
}
	public void watch(){
    	System.out.println(name+"再看java基础入门书籍");}
    public  void love(){
    		System.out.println(name+"爱李青华");
    	}
    public void student() {
		
	}
    public void student(String id,String name, int age) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
		
	}
    public void setId(String id){//传入变量
    	this.id=id;//赋给公共的ID
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

