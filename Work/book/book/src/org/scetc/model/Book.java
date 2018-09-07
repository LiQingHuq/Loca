package org.scetc.model;

public class Book {

	private int id;
	private String name;
	private String publish;
	private float price;
	private String img;
	
	public Book() {
		
	}
	
	public Book(int id, String name, String publish, float price, String img) {
		this.id = id;
		this.name = name;
		this.publish = publish;
		this.price = price;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
