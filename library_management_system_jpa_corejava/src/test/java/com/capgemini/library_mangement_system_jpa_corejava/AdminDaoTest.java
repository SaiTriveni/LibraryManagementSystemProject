package com.capgemini.library_mangement_system_jpa_corejava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.library_management_system_jpa_corejava.dao.AdminDao;
import com.capgemini.library_management_system_jpa_corejava.dao.AdminDaoImplementation;
import com.capgemini.library_management_system_jpa_corejava.dto.InformationDto;

public class AdminDaoTest {
	private AdminDao dao = new AdminDaoImplementation();

	@Test
	public void testRegister() {
		InformationDto info = new InformationDto();
		info.setId(123768);
		info.setName("Tulasi");
		info.setEmail("tulasi@gmail.com");
		info.setPassword("Tulasi@1");
		info.setTypeOfUser("admin");
		boolean status = dao.register(info);
		Assertions.assertTrue(status);
		Assertions.assertFalse(status);
	}

}
