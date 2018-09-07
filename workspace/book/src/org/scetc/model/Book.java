package org.scetc.model;

public class Book {

	private int id;
	private String account;
   private String password;
   private String picture;
	
	public Book(int id, String account, String password,String picture) {
	this.id = id;
	this.account = account;
	this.password = password;
	this.picture=picture;
}

	public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public String getPicture() {
	return picture;
}

public void setPicture(String picture) {
	this.picture = picture;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
