package com.core.boot.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.core.boot.entites.Book;

@Component
public class BookDao {
	private static List<Book> books  = new ArrayList<>();
	BookDao(){
		books.add(new Book(12,"Java For Beginners","ABC"));
		books.add(new Book(13,"Java For Intermediate","XYZ"));
		books.add(new Book(14,"Python For Beginners","ABC"));
	}
	
	public List<Book> getbooks(){
		
		return books;
	}
	public Book getBookById(int id) {
		Book book = null;
		Stream<Book> s = books.stream();
		book = s.filter(b->b.getId()==id).findFirst().get();
		return book;
	}
	public void addBook(Book b) {
		books.add(b);
	}
}
