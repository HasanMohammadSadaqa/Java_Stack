package com.springprojects.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.springprojects.bookclub.models.Book;
import com.springprojects.bookclub.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	//methods
	//method to get and create the first page
	@GetMapping("/books/new")
	public String addBookPage(@ModelAttribute("newBook") Book newBook, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}else {
			return "add_book.jsp";
		}
	}
	
	@PostMapping("/books/new")
	public String createNewBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result) {
		if(result.hasErrors()) {
			return "add_book.jsp";
		} else {
			System.out.println("11111111111111111111111111");
			bookService.createBook(newBook);
			System.out.println("222222222222222222222222222222");
			return "redirect:/";
		}
	}
	
	//methods to show the page of each book  then edit and delete
	//method to render book page
	@GetMapping("/books/{id}")
	public String viewBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookService.findBook(id));
		return "book_page.jsp";
	}
	
	//method to edit 
	@GetMapping("/books/{book_id}/edit")
	public String editPage(@PathVariable("book_id") Long bookId, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("updatedBook", bookService.findBook(bookId));
		return "edit_book.jsp";
	}
	
	@PutMapping("/books/{book_id}/edit")
	public String updatedBook(@Valid @ModelAttribute("updatedBook") Book updatedBook, BindingResult result, @PathVariable("book_id") Long id) {
		if (result.hasErrors()) {
			return "edit_book.jsp";
		}else {
			bookService.createBook(updatedBook);
			return "redirect:/books/"+id;
		}
	}
	
	//method to delete
	@GetMapping("/books/{id}/delete")
	public String deleteBook(Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}
