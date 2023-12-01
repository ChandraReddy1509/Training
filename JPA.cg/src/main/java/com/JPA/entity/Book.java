package com.JPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "bandu")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String title;
	private String author;
	private int price;
	
	public  Book() {
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(int id, String title, String author, int price) {
		super();
		this.Id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
