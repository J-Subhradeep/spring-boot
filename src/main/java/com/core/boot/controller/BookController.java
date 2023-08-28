package com.core.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.core.boot.dao.BookDao;
import com.core.boot.entites.Book;



@RestController
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public List<Book> getBooks() {
		
		return bookDao.getbooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookDao.getBookById(id);
	}
	
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book b) {
		this.bookDao.addBook(b);
		return b;
	}
	
}
