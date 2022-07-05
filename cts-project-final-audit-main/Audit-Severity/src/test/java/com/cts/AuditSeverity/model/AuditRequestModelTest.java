package com.cts.AuditSeverity.model;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * 	Test case to test AuditRequestModel Class
 *
 */
@SpringBootTest
public class AuditRequestModelTest {

	private AuditRequestModel request;
	
	@BeforeEach
	public void setup() {
		request = new AuditRequestModel();
	}
	
	@Test
	public void testGetSetProjectName() {
		request.setProjectName("ProjectName");
		assertEquals("ProjectName", request.getProjectName());
	}
	@Test
	public void testGetSetProjectManagerName() {
		request.setManagerName("ManagerName");
		assertEquals("ManagerName", request.getManagerName());
	}
	@Test
	public void testGetSetOwnerName() {
		request.setOwnerName("OwnerName");
		assertEquals("OwnerName", request.getOwnerName());
	}
	@Test
	public void testGetRequestId() {
		assertEquals(0, request.getRequestId());
	}
	
}
