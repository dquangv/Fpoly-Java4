package com.poly.model;

public class Product {
	String name, photo;
	float price;

	public Product(String name, String photo, float price) {
		super();
		this.name = name;
		this.photo = photo;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


}
