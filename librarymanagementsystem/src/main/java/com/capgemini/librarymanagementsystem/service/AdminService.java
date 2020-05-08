package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BookDto;
import com.capgemini.librarymanagementsystem.dto.InformationDto;

public interface AdminService {

	boolean register(InformationDto admin);
	boolean auth(String email,String password);
	boolean addBook(BookDto book);
	List<BookDto> searchBookTitle(String bookTitle);
	List<BookDto> searchBookAuthor(String bookAuthor);
	List<BookDto> searchBookType(String bookType);
	boolean updateBook(int bookId, String author);
	boolean removeBook(int bookId);
	List<BookDto> getBooksInfo();

	boolean issueBook(int bookId, int userId);
	boolean returnBook(int userId, int bookId);

}
