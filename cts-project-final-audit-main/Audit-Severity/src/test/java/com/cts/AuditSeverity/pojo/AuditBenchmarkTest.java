package com.cts.AuditSeverity.pojo;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * 	Test class to test AuditBenchMark 
 *
 */
@SpringBootTest
public class AuditBenchmarkTest {

	private AuditBenchmark benchmark;
	
	@BeforeEach
	public void setup() {
		benchmark = new AuditBenchmark();
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testGetSetAuditType() {
		benchmark.setAuditType("Internal");
		assertEquals("Internal", benchmark.getAuditType());
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testGetSetAccNoAnswers() {
		benchmark.setAccNoAnswers(12);
		assertEquals(12, benchmark.getAccNoAnswers());
	}
}
