package com.cts.AuditSeverity.model;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * 	Test case to test AuditDetailModel Class
 *
 */
@SpringBootTest
public class AuditDetailModelTest {

	private AuditDetailModel detailModel;
	
	@BeforeEach
	public void setup() {
		detailModel = new AuditDetailModel();
	}
	
	@Test
	public void testGetSetAuditType() {
		detailModel.setAuditType("Internal");
		assertEquals("Internal", detailModel.getAuditType());
	}
	@Test
	public void testGetSetAuditDate() {
		Date date = new Date();
		detailModel.setAuditDate(date);
		assertEquals(date, detailModel.getAuditDate());
	}
	@Test
	public void testGetAuditId() {
		assertEquals(0, detailModel.getAuditId());
	}
}
