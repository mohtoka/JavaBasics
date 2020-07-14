package com.syntax.class21;

public class Book {

	String title, author;
	int year;

	Book(String title, String author, int year) {
		this();
		System.out.println("Title of the book is " + title +" written by " + author + " in the year " + year);
	}

	Book() {
		this.author = author;
		this.year = year;
		this.title = title;
	}

	public static void main(String[] args) {

		Book b = new Book("Harry Potter", "JK Rowling", 2005);
		Book k = new Book("Twilight", "St Meyers", 2010);

	}

}
