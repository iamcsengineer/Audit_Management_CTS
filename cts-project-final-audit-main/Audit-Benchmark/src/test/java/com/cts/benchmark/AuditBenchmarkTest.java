package com.cts.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class AuditBenchmarkTest {

	@Mock
	private AuditBenchmark benchmark;
	
	@BeforeEach
	public void setup() {
		benchmark = new AuditBenchmark("Internal", 3);
	}
	
	@Test
	public void testGetSetAuditType() {
		assertEquals("Internal", benchmark.getAuditType());
		benchmark.setAuditType("SOX");
		assertEquals("SOX", benchmark.getAuditType());
	}
	@Test
	public void testGetSetAccNoAnswers() {
		assertEquals(new Integer(3), benchmark.getAccNoAnswers());
		benchmark.setAccNoAnswers(1);
		assertEquals(new Integer(1), benchmark.getAccNoAnswers());
	}
}
