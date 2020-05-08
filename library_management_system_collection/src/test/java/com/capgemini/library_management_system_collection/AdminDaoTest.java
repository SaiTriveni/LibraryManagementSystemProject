package com.capgemini.library_management_system_collection;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.library_management_system_collections.dao.AdminDao;
import com.capgemini.library_management_system_collections.dao.AdminDaoImplementation;
import com.capgemini.library_management_system_collections.dto.AdminDto;
import com.capgemini.library_management_system_collections.dto.BookDto;

public class AdminDaoTest {

	private AdminDao dao = new AdminDaoImplementation();
	
	@Test
	public void testRegister() {
		
		AdminDto dto = new AdminDto();
		dto.setAdminUserId(212121);
		dto.setAdminUserName("Anudeep");
		dto.setAdminEmail("anudeep@gmail.com");
		dto.setAdminPassword("Anudeep@1");
		boolean status = dao.register(dto);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testLogin() {
		boolean status = dao.auth("sai@gmail.com","Sai@160498");
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testAddBook() {
		
		BookDto dto = new BookDto();
		dto.setBookId(111222);
		dto.setBookTitle("Jspiders");
		dto.setBookAuthor("Sunil");
		dto.setBookType("Education");
		dto.setBookPublisher("SAP Publishers");
		boolean status = dao.addBook(dto);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testSearchBookTitle() {
		
		ArrayList<BookDto> searchList = dao.searchBookTitle("Jspiders");
		Assertions.assertNotNull(searchList);
	}
	
	@Test
	public void testSearchBookAuthor() {
		
		ArrayList<BookDto> searchList = dao.searchBookAuthor("Sunil");
		Assertions.assertNotNull(searchList);
	}
	
	@Test
	public void testSearchBookType() {
		
		ArrayList<BookDto> searchList = dao.searchBookType("Education");
		Assertions.assertNotNull(searchList);
	}
	
//	@Test
//	public void testUpdateBook() {
//		
//		int bookId = dao.updateBook(111222);
//		Assertions.assertAll(bookId);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
