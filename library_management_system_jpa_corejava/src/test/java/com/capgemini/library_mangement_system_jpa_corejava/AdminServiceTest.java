package com.capgemini.library_mangement_system_jpa_corejava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.library_management_system_jpa_corejava.dao.AdminDao;
import com.capgemini.library_management_system_jpa_corejava.dao.AdminDaoImplementation;
import com.capgemini.library_management_system_jpa_corejava.dto.InformationDto;
import com.capgemini.library_management_system_jpa_corejava.service.AdminService;
import com.capgemini.library_management_system_jpa_corejava.service.AdminServiceImplementation;

public class AdminServiceTest {

	private AdminService service=new AdminServiceImplementation();

	@Test
	public void testRegister() {
		InformationDto info = new InformationDto();
		info.setId(189564);
		info.setName("Tulasi");
		info.setEmail("tulasi@gmail.com");
		info.setPassword("Tulasi@1");
		info.setTypeOfUser("admin");
		boolean status = service.register(info);
		Assertions.assertTrue(status);
		Assertions.assertFalse(status);
	}
	
}
