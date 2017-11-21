package org.isbn.bk;

public class Book {
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bname, String publisher, String author, String isbn_no, double price,
			String published) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.publisher = publisher;
		this.author = author;
		this.isbn_no = isbn_no;
		this.price = price;
		this.published = published;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn_no() {
		return isbn_no;
	}

	public void setIsbn_no(String isbn_no) {
		this.isbn_no = isbn_no;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	private int bid;
	private String bname;
	private String publisher;
	private String author;
	private String isbn_no;
	private double price;
	private String published;

}
