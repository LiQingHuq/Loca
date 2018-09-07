package it.cast.Entity;

public class Student {

	public Student() {
		// TODO 自动生成的构造函数存根
	}
	public  String grade;
	public String location;
    public  String name;
	public Student(String name, String grade, String location) {
		super();
		this.name = name;
		this.grade = grade;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
}
