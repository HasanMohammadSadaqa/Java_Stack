package com.springprojects.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.bookclub.models.Book;
import com.springprojects.bookclub.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepo;
	
	//methods
	//method to retrieve all books
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	//method to fin specific element
	public Book findBook(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		if (book.isPresent()) {
			return book.get();
		}else {
			return null;
		}
	}
	//method to create book
	public Book createBook(Book bookToCreate) {
		return bookRepo.save(bookToCreate);
	}
	
	//method to delete a book 
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
