package com.cts.AuditSeverity.pojo;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * 	Test class to test AuditDetails 
 *
 */
@SpringBootTest
public class AuditDetailTest {

	private AuditDetails details;
	
	@BeforeEach
	public void setup() {
		details = new AuditDetails();
	}
	
	@Test
	public void testGetSetAuditType() {
		details.setAuditType("Internal");
		assertEquals("Internal", details.getAuditType());
	}
	
	@Test
	public void testGetSetAuditDate() {
		Date date = new Date();
		details.setAuditDate(date);
		assertEquals(date, details.getAuditDate());
	}
}
