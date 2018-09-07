package cn.itcast.domain;

public class Students {

	public Students() {
		// TODO 自动生成的构造函数存根
	}
	String idcard;
	String examid;
	String name;
	String grade;
	String location;
	public String getIdcard() {
		return idcard;
	}
	public Students(String idcard, String examid, String name, String grade, String location) {
		super();
		this.idcard = idcard;
		this.examid = examid;
		this.name = name;
		this.grade = grade;
		this.location = location;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
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
	public void setGrade(String i) {
		this.grade = i;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
