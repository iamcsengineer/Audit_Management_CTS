package com.cts.AuditSeverity.pojo;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * Test class to test AuditResponse
 *
 */
@SpringBootTest
public class AuditResponseTest {

	private AuditResponse response;
	
	@BeforeEach
	public void setup() {
		response = new AuditResponse("GREEN", "2 Weeks");
	}
	
	@Test
	public void testGetSetAuditId() {
		response.setAuditId(101);
		assertEquals(101, response.getAuditId());
	}
	@Test
	public void testGetSetProjectExecutionStatus() {
		response.setProjectExecutionStatus("RED");
		assertEquals("RED", response.getProjectExecutionStatus());
	}
	@Test
	public void testGetSetRemedialActionDuration() {
		response.setRemedialActionDuration("None");
		assertEquals("None", response.getRemedialActionDuration());
	}
}
